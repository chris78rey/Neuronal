/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.solicitudesfacturas;

import ec.com.neurotest.entidades.empleadounido.V00001empleados;
import ec.com.neurotest.entidades.facturaview.V00004factura;
import ec.com.neurotest.entidades.items.Items;
import ec.com.neurotest.entidades.medicorefiere.V00001medicorefiere;
import ec.com.neurotest.entidades.registroitems.RegistroItems;
import ec.com.neurotest.entidades.seqmaxsolicitud.V00003seqmaxsolicitud;
import ec.com.neurotest.entidades.solicitante.V00003personasolicitante;
import ec.com.neurotest.entidades.solicitudmap.Solicitud;
import ec.com.neurotest.entidades.solicxitem.SolicitudXItem;
import ec.com.neurotest.fachadas.cliente.ClienteFacade;
import ec.com.neurotest.fachadas.empleadounido.V00001empleadosFacade;
import ec.com.neurotest.fachadas.facturaview.V00004facturaFacade;
import ec.com.neurotest.fachadas.medicorefiere.V00001medicorefiereFacade;
import ec.com.neurotest.fachadas.solicitudm.V00003seqmaxsolicitudFacade;
import ec.com.neurotest.fachadas.solicxitem.SolicitudXItemFacade;
import ec.com.neurotest.negocio.mantenimiento.GrabaFactura;
import ec.com.neurotest.negocio.mantenimiento.GuardaCabeceraSolicitud;
import ec.com.neurotest.negocio.mantenimiento.ReglasNegocioLocal;
import ec.com.neurotest.negocio.mantenimiento.SolicitanteLocal;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 
 * @author crrb
 */
@Named(value="solicitudes")
@ViewScoped
public class Solicitudes implements Serializable {

    @EJB
    transient private V00004facturaFacade v00004facturaFacade;
    private List<V00004factura> listafacturaconsumasdetalle;

    @EJB
    transient private V00001empleadosFacade v00001empleadosFacade;

    private List<V00001empleados> listaempleadounido;

    @EJB
    transient private SolicitudXItemFacade solicitudXItemFacade;

    @EJB
    transient private V00003seqmaxsolicitudFacade v00003seqmaxsolicitudFacade;

    @EJB
    transient private ClienteFacade clienteFacade;

    @EJB
    transient private GuardaCabeceraSolicitud guardaCabeceraSolicitud;
    private Solicitud guardacabesolicitudmb;

    @EJB
    transient private GrabaFactura grabaFactura;
    private RegistroItems registroItems;

    private boolean valorswitch;
    @EJB
    transient private ReglasNegocioLocal reglasNegocio;

    private List<Items> listaitemsofertadosconcosto;

    private Items itemseleccionado = new Items();

    public List<Items> getListaItemsLaboratorio() {
        return reglasNegocio.getListaItemsLaboratoriosingrupos();
    }


    @EJB
    transient private V00001medicorefiereFacade v00001medicorefiereFacade;

    private List<V00001medicorefiere> listaRefierenCentrosMedicos;
    private V00001medicorefiere selectedMedicoRefiereO = new V00001medicorefiere();

    @EJB
    transient private SolicitanteLocal solicitante;
    private V00003personasolicitante selected;

    private List<V00003personasolicitante> listadelosquefacturan;

    public int count() {
        return solicitante.count();
    }

    public void create(V00003personasolicitante entity) {
        solicitante.create(entity);
    }

    public void edit(V00003personasolicitante entity) {
        solicitante.edit(entity);
    }

    public V00003personasolicitante find(Object id) {
        return solicitante.find(id);
    }

    public List<V00003personasolicitante> findAll() {
        return solicitante.findAll();
    }

    public List<V00003personasolicitante> findRange(int[] range) {
        return solicitante.findRange(range);
    }

    public void remove(V00003personasolicitante entity) {
        solicitante.remove(entity);
    }

    private static final long serialVersionUID = 2453007297000433366L;

    /**
     * Creates a new instance of Solicitudes
     */
    public Solicitudes() {
        this.ltotalfact = new ArrayList<>();
        this.listafacturaconsumasdetalle = new ArrayList<>();
        this.idempleado = new BigDecimal(0);
        this.listaempleadounido = new ArrayList<>();
        this.guardacabesolicitudmb = new Solicitud();
        this.registroItems = new RegistroItems();
        this.seleccionadoparaeliminar = new Items();
        this.listaitemsofertadosconcostoseleccion = new ArrayList<>();
        this.listaitemsofertadosconcosto = new ArrayList<>();
        this.listaRefierenCentrosMedicos = new ArrayList<>();
        this.listadelosquefacturan = new ArrayList<>();
        this.selected = new V00003personasolicitante();
    }

    @PostConstruct
    private void init() {
        listadelosquefacturan = findAll();
        v00001medicorefiereFacade.findAll();
        listaRefierenCentrosMedicos = v00001medicorefiereFacade.findAll();
        listaitemsofertadosconcosto = reglasNegocio.getListaItemsLaboratorio();
        listaempleadounido = v00001empleadosFacade.findAll();
        listafacturaconsumasdetalle = v00004facturaFacade.findbyNumeroSoliFactura(new BigInteger("0"));
        inactibaguardar = false;
    }

    /**
     * @return the listadelosquefacturan
     */
    public List<V00003personasolicitante> getListadelosquefacturan() {
        return listadelosquefacturan;
    }

    /**
     * @param listadelosquefacturan the listadelosquefacturan to set
     */
    public void setListadelosquefacturan(List<V00003personasolicitante> listadelosquefacturan) {
        this.listadelosquefacturan = listadelosquefacturan;
    }

    /**
     * @return the selected
     */
    public V00003personasolicitante getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(V00003personasolicitante selected) {
        this.selected = selected;
    }

    public void buttonActionNuevo(ActionEvent actionEvent) {
        selected = new V00003personasolicitante();

    }

    public void buttonActionGrabar(ActionEvent actionEvent) {
        try {
            selected.setApellido(selected.getApellido().toUpperCase(Locale.US));
            selected.setNombre(selected.getNombre().toUpperCase(Locale.US));
            solicitante.create(selected);
            listadelosquefacturan = findAll();

        } catch (Exception e) {
            System.out.println("e = " + e.getLocalizedMessage());
        }


    }

    public void buttonActionEliminar(ActionEvent actionEvent) {
//        v00001medicorefiereFacade.remove(selected);
//        selected = new V00001medicorefiere();
//        listamedicosRefieren = findAll();

    }

    public void buttonActionActualizar(ActionEvent actionEvent) {
        selected.setApellido(selected.getApellido().toUpperCase(Locale.US));
        selected.setNombre(selected.getNombre().toUpperCase(Locale.US));

        solicitante.edit(selected);
        listadelosquefacturan = findAll();
    }

    /**
     * @return the listaRefierenCentrosMedicos
     */
    public List<V00001medicorefiere> getListaRefierenCentrosMedicos() {
        return listaRefierenCentrosMedicos;
    }

    /**
     * @return the selectedMedicoRefiereO
     */
    public V00001medicorefiere getSelectedMedicoRefiereO() {
        return selectedMedicoRefiereO;
    }

    /**
     * @param selectedMedicoRefiereO the selectedMedicoRefiereO to set
     */
    public void setSelectedMedicoRefiereO(V00001medicorefiere selectedMedicoRefiereO) {
        this.selectedMedicoRefiereO = selectedMedicoRefiereO;
    }

    public void limpiaref(ActionEvent actionEvent) {
        selectedMedicoRefiereO = new V00001medicorefiere();
    }

    /**
     * @return the listaitemsofertadosconcosto
     */
    public List<Items> getListaitemsofertadosconcosto() {
        return listaitemsofertadosconcosto;
    }

    /**
     * @return the itemseleccionado
     */
    public Items getItemseleccionado() {
        return itemseleccionado;
    }

    /**
     * @param itemseleccionado the itemseleccionado to set
     */
    public void setItemseleccionado(Items itemseleccionado) {
        this.itemseleccionado = itemseleccionado;
    }

    private BigDecimal idempleado;

    private List<Items> listaitemsofertadosconcostoseleccion;
    private Items seleccionadoparaeliminar;
    public void buttonActionPasaLista(ActionEvent actionEvent) {
        //esto se aumento para control de que persona atiende al paciente
        itemseleccionado.setIdempleado(idempleado);
        listaitemsofertadosconcostoseleccion.add(itemseleccionado);
    }

    /**
     * @return the listaitemsofertadosconcostoseleccion
     */
    public List<Items> getListaitemsofertadosconcostoseleccion() {
        return listaitemsofertadosconcostoseleccion;
    }

    /**
     * @param listaitemsofertadosconcostoseleccion the
     * listaitemsofertadosconcostoseleccion to set
     */
    public void setListaitemsofertadosconcostoseleccion(List<Items> listaitemsofertadosconcostoseleccion) {
        this.listaitemsofertadosconcostoseleccion = listaitemsofertadosconcostoseleccion;
    }

    public void EliminaseleccionActionPasaLista(ActionEvent actionEvent) {
        listaitemsofertadosconcostoseleccion.remove(seleccionadoparaeliminar);
    }

    /**
     * @return the seleccionadoparaeliminar
     */
    public Items getSeleccionadoparaeliminar() {
        return seleccionadoparaeliminar;
    }

    /**
     * @param seleccionadoparaeliminar the seleccionadoparaeliminar to set
     */
    public void setSeleccionadoparaeliminar(Items seleccionadoparaeliminar) {
        this.seleccionadoparaeliminar = seleccionadoparaeliminar;
    }

    /**
     * @return the valorswitch
     */
    public boolean isValorswitch() {
        return valorswitch;
    }

    /**
     * @param valorswitch the valorswitch to set
     */
    public void setValorswitch(boolean valorswitch) {
        this.valorswitch = valorswitch;
    }

    public void addMessage() {
        String summary = valorswitch ? "Se va a aplicar descuento" : "Sin descuento";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }
    BigInteger idsolici;

    public void addMessageGrabar() {
        idsolici = null;
        boolean empty = listaitemsofertadosconcostoseleccion.isEmpty();
        if (!empty) {

        String summary = valorswitch ? "La información se ha grabado correctamente" : "";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));

        try {

            guardacabesolicitudmb.setIdPaciente(new BigInteger(selected.getId().toString()));
            guardacabesolicitudmb.setIdRefiere(selectedMedicoRefiereO.getId());
            guardacabesolicitudmb.setSolicitudActiva(BigInteger.ONE);

            if (valorswitch == true) {
                guardacabesolicitudmb.setDescuento(BigInteger.ONE);

            } else {

                guardacabesolicitudmb.setDescuento(BigInteger.ZERO);
            }

            guardaCabeceraSolicitud.create(guardacabesolicitudmb);
            List<V00003seqmaxsolicitud> maximasol = v00003seqmaxsolicitudFacade.findAll();
            
            V00003seqmaxsolicitud next = null;
            Iterator<V00003seqmaxsolicitud> iterator = maximasol.iterator();
            while (iterator.hasNext()) {
                next = iterator.next();

            }
            idsolici = null;
            if (next != null) {

                idsolici = next.getIdsolici();

            }
            guardacabesolicitudmb = guardaCabeceraSolicitud.find(new BigDecimal(idsolici));

            Iterator<Items> iterator1 = listaitemsofertadosconcostoseleccion.iterator();
            SolicitudXItem detallefactura = new SolicitudXItem();
            while (iterator1.hasNext()) {
                try {
                    Items next1 = iterator1.next();

                    detallefactura.setIdSolicitud(idsolici.doubleValue());
                    try {
                        detallefactura.setIdEmpleado(next1.getIdempleado().toBigInteger());
                    } catch (Exception e) {
                        System.out.println("e = " + e.getLocalizedMessage());
                    }

                    detallefactura.setIdItem(next1.getId().toBigInteger());
                    detallefactura.setCantidad(BigInteger.ONE);
                    detallefactura.setFechaRegistro(new Date());
                    detallefactura.setPacienteRevisado(BigInteger.ZERO);

                    if (valorswitch == true) {
                        detallefactura.setDescuento(BigInteger.ONE);

                    } else {

                        detallefactura.setDescuento(BigInteger.ZERO);
                    }
                    detallefactura.setIdRefiere(selectedMedicoRefiereO.getId());
                    solicitudXItemFacade.create(detallefactura);
                    inactibaguardar = true;
                    listafacturaconsumasdetalle = v00004facturaFacade.findbyNumeroSoliFactura(idsolici);
                } catch (Exception e) {
                    System.out.println("e = " + e.getLocalizedMessage());
                }


            }


        } catch (Exception e) {
            System.out.println("e = " + e.getLocalizedMessage());
        }
        }
    }

    /**
     * @return the registroItems
     */
    public RegistroItems getRegistroItems() {
        return registroItems;
    }

    /**
     * @param registroItems the registroItems to set
     */
    public void setRegistroItems(RegistroItems registroItems) {
        this.registroItems = registroItems;
    }

    /**
     * @return the guardacabesolicitudmb
     */
    public Solicitud getGuardacabesolicitudmb() {
        return guardacabesolicitudmb;
    }

    /**
     * @param guardacabesolicitudmb the guardacabesolicitudmb to set
     */
    public void setGuardacabesolicitudmb(Solicitud guardacabesolicitudmb) {
        this.guardacabesolicitudmb = guardacabesolicitudmb;
    }

    public void buttonActionGrabarCabecera(ActionEvent actionEvent) throws Exception {

        try {


            guardacabesolicitudmb.setIdPaciente(new BigInteger(selected.getId().toString()));
            guardacabesolicitudmb.setIdRefiere(selectedMedicoRefiereO.getId());
            guardacabesolicitudmb.setSolicitudActiva(BigInteger.ONE);

            if (valorswitch == true) {
                guardacabesolicitudmb.setDescuento(BigInteger.ONE);

            } else {

                guardacabesolicitudmb.setDescuento(BigInteger.ZERO);
            }
//            Date fechaSolicitud = getGuardacabesolicitudmb().getFechaSolicitud();
            guardaCabeceraSolicitud.create(guardacabesolicitudmb);
            List<V00003seqmaxsolicitud> maximasol = v00003seqmaxsolicitudFacade.findAll();

//            BigDecimal id = guardacabesolicitudmb.getId();
            V00003seqmaxsolicitud next = null;
            Iterator<V00003seqmaxsolicitud> iterator = maximasol.iterator();
            while (iterator.hasNext()) {
                next = iterator.next();

            }
            BigInteger idsolici = null;
            if (next == null) {
                
            } else {
                idsolici = next.getIdsolici();

            }
            guardacabesolicitudmb = guardaCabeceraSolicitud.find(new BigDecimal(idsolici));

            Iterator<Items> iterator1 = listaitemsofertadosconcostoseleccion.iterator();
            SolicitudXItem detallefactura = new SolicitudXItem();
            while (iterator1.hasNext()) {
                Items next1 = iterator1.next();

                detallefactura.setIdSolicitud(idsolici.doubleValue());
                detallefactura.setIdItem(next1.getId().toBigInteger());

                if (valorswitch == true) {
                    detallefactura.setDescuento(BigInteger.ONE);

                } else {

                    detallefactura.setDescuento(BigInteger.ZERO);
                }
                detallefactura.setIdRefiere(selectedMedicoRefiereO.getId());
                solicitudXItemFacade.create(detallefactura);

            }


        } catch (Exception e) {
            LOG.log(Level.INFO, "bundle_key");
        }

    }
    private static final Logger LOG = Logger.getLogger(Solicitudes.class.getName());
    private Boolean inactibaguardar = false;

    /**
     * @return the inactibaguardar
     */
    public Boolean getInactibaguardar() {
        return inactibaguardar;
    }

    /**
     * @param inactibaguardar the inactibaguardar to set
     */
    public void setInactibaguardar(Boolean inactibaguardar) {
        this.inactibaguardar = inactibaguardar;
    }

    /**
     * @return the listaempleadounido
     */
    public List<V00001empleados> getListaempleadounido() {
        return listaempleadounido;
    }

    /**
     * @return the idempleado
     */
    public BigDecimal getIdempleado() {
        return idempleado;
    }

    /**
     * @param idempleado the idempleado to set
     */
    public void setIdempleado(BigDecimal idempleado) {
        this.idempleado = idempleado;
    }

    /**
     * @return the listafacturaconsumasdetalle
     */
    public List<V00004factura> getListafacturaconsumasdetalle() {
        return listafacturaconsumasdetalle;
    }

    private List<V00004factura> ltotalfact;

    /**
     * @param listafacturaconsumasdetalle the listafacturaconsumasdetalle to set
     */
    public void setListafacturaconsumasdetalle(List<V00004factura> listafacturaconsumasdetalle) {
        this.listafacturaconsumasdetalle = listafacturaconsumasdetalle;
    }

    /**
     * @return the ltotalfact
     */
    public List<V00004factura> getLtotalfact() {
        Iterator<V00004factura> iterator = listafacturaconsumasdetalle.iterator();
        V00004factura next = null;
        while (iterator.hasNext()) {
            next = iterator.next();

        }
        ltotalfact = new ArrayList<>();
        ltotalfact.add(next);

        return ltotalfact;
    }

    /**
     * @param ltotalfact the ltotalfact to set
     */
    public void setLtotalfact(List<V00004factura> ltotalfact) {
        this.ltotalfact = ltotalfact;
    }

    public void buttonActionLimpiaFactura(ActionEvent actionEvent) {
//        this.ltotalfact = new ArrayList<>();
//        this.listafacturaconsumasdetalle = new ArrayList<>();
//        this.idempleado = new BigDecimal(0);
//        this.listaempleadounido = new ArrayList<>();
//        this.guardacabesolicitudmb = new Solicitud();
//        this.registroItems = new RegistroItems();
//        this.seleccionadoparaeliminar = new Items();
        this.listaitemsofertadosconcostoseleccion = new ArrayList<>();
//        this.listaitemsofertadosconcosto = new ArrayList<>();
//        this.listaRefierenCentrosMedicos = new ArrayList<>();
//        this.listadelosquefacturan = new ArrayList<>();
//        this.selected = new V00003personasolicitante();

    }


}
