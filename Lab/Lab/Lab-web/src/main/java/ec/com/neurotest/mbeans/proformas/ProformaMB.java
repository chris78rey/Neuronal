/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.proformas;

import ec.com.neurotest.entidades.empleado.V00002empleado;
import ec.com.neurotest.entidades.proformas.V00005proforma;
import ec.com.neurotest.entidades.seqmaxsolicitud.V00003seqmaxsolicitud;
import ec.com.neurotest.entidades.solicitante.V00003personasolicitante;
import ec.com.neurotest.entidades.solicitudmap.Solicitud;
import ec.com.neurotest.entidades.solicitudrefiere.Solicitudrefiere;
import ec.com.neurotest.entidades.solicxitem.SolicitudXItem;
import ec.com.neurotest.fachadas.empleado.V00002empleadoFacade;
import ec.com.neurotest.fachadas.proformas.V00005proformaFacade;
import ec.com.neurotest.fachadas.solicitante.V00003personasolicitanteFacade;
import ec.com.neurotest.fachadas.solicitudm.V00003seqmaxsolicitudFacade;
import ec.com.neurotest.fachadas.solicitudmap.SolicitudFacade;
import ec.com.neurotest.fachadas.solicitudrefiere.SolicitudrefiereFacade;
import ec.com.neurotest.fachadas.solicxitem.SolicitudXItemFacade;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author crrb
 */
@Named(value="proformaMB")
@ViewScoped
public class ProformaMB implements Serializable {

    @EJB
    transient private SolicitudXItemFacade solicitudXItemFacade;

    @EJB
    transient private SolicitudrefiereFacade solicitudrefiereFacade;
    private List<Solicitudrefiere> listarefierequeseregistraenproforma;

    @EJB
    transient private V00002empleadoFacade v00002empleadoFacade;
    private List<V00002empleado> listadeempleadosqueatienden = new ArrayList<>();
    private List<V00002empleado> listadeempleadosqueatiendentodos = new ArrayList<>();
    @EJB
    transient private V00003seqmaxsolicitudFacade v00003seqmaxsolicitudFacade;

    @EJB
    transient private SolicitudFacade solicitudFacade;
    private Solicitud solicitud = new Solicitud();
    @EJB
    transient private V00003personasolicitanteFacade v00003personasolicitanteFacade;

    @EJB
    transient private V00005proformaFacade v00005proformaFacade;





    public List<V00005proforma> findModuloPorNombre(BigInteger par) {
        return v00005proformaFacade.findModuloPorNombre(par);
    }

    public List<V00005proforma> findAll() {
        return v00005proformaFacade.findAll();
    }

    public V00005proforma find(BigInteger id) throws Exception {
        V00005proforma find = v00005proformaFacade.find(id);
        return find;
    }
    private V00005proforma seleccionproforma = new V00005proforma();

    @PostConstruct
    private void init() {
        try {

            setLproforma(findAll());
            personasolicitante = v00003personasolicitanteFacade.findAll();
//            listadeempleadosqueatienden = v00002empleadoFacade.findAll();
            listadeempleadosqueatienden = v00002empleadoFacade.findReferenteconUtilidad();
            listadeempleadosqueatiendentodos = v00002empleadoFacade.findAll();
            listarefierequeseregistraenproforma = new ArrayList<>();

        } catch (Exception e) {
        }
    }
    private List<V00005proforma> lproforma;

    private static final long serialVersionUID = -297770338747230813L;

    /**
     * Creates a new instance of ProformaMB
     */
    public ProformaMB() {
        this.listarefierequeseregistraenproforma = new ArrayList<Solicitudrefiere>();
        this.condescuento = new Double("0");
        this.sindescuento = new Double("0");
        this.agregarcliente = new V00003personasolicitante();
        this.personaatendida = new V00003personasolicitante();
        this.personapaga = new V00003personasolicitante();
        this.personasolicitante = new ArrayList<>();
        this.lproforma = new ArrayList<>();
    }

    /**
     * @return the v00005proformaFacade
     */
    public V00005proformaFacade getV00005proformaFacade() {
        return v00005proformaFacade;
    }

    /**
     * @param v00005proformaFacade the v00005proformaFacade to set
     */
    public void setV00005proformaFacade(V00005proformaFacade v00005proformaFacade) {
        this.v00005proformaFacade = v00005proformaFacade;
    }

    /**
     * @return the lproforma
     */
    public List<V00005proforma> getLproforma() {
        return lproforma;
    }

    /**
     * @param lproforma the lproforma to set
     */
    public void setLproforma(List<V00005proforma> lproforma) {
        this.lproforma = lproforma;
    }

    private V00005proforma selected = new V00005proforma();

    /**
     * @return the selected
     */
    public V00005proforma getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(V00005proforma selected) {
        this.selected = selected;
    }

    public void listen1(AjaxBehaviorEvent event) {

    }

    public void buttonActionAgregItemProforma(ActionEvent actionEvent) {
        try {
            lprofdeta.add(selected);
        } catch (Exception e) {
        }
    }

    public void buttonActionLimpiar(ActionEvent actionEvent) {

        try {

            lprofdeta.remove(seleccionproforma);
        } catch (Exception e) {
        }
    }

    private Double sindescuento;
    private Double condescuento;

    private List<V00005proforma> lprofdeta = new ArrayList<>();

    /**
     * @return the lprofdeta
     */
    public List<V00005proforma> getLprofdeta() {
        return lprofdeta;
    }

    /**
     * @param lprofdeta the lprofdeta to set
     */
    public void setLprofdeta(List<V00005proforma> lprofdeta) {
        this.lprofdeta = lprofdeta;
    }

    /**
     * @return the sindescuento
     */
    public Double getSindescuento() throws Exception {
        Iterator<V00005proforma> iterator = lprofdeta.iterator();
        double valor = 0;
        while (iterator.hasNext()) {
            V00005proforma next = iterator.next();
            valor += next.getSinDescuento();
        }
        sindescuento = valor;
        return sindescuento;
    }

    /**
     * @param sindescuento the sindescuento to set
     */
    public void setSindescuento(Double sindescuento) {
        this.sindescuento = sindescuento;
    }

    /**
     * @return the condescuento
     */
    public Double getCondescuento() {
        Iterator<V00005proforma> iterator = lprofdeta.iterator();
        double valor = 0;
        while (iterator.hasNext()) {
            V00005proforma next = iterator.next();
            valor += next.getConDescuento().doubleValue();
        }
        condescuento = new Double(valor);


        return condescuento;
    }

    /**
     * @param condescuento the condescuento to set
     */
    public void setCondescuento(Double condescuento) {
        this.condescuento = condescuento;
    }

    /**
     * @return the seleccionproforma
     */
    public V00005proforma getSeleccionproforma() {
        return seleccionproforma;
    }

    /**
     * @param seleccionproforma the seleccionproforma to set
     */
    public void setSeleccionproforma(V00005proforma seleccionproforma) {
        this.seleccionproforma = seleccionproforma;
    }

    /**
     * @return the v00003personasolicitanteFacade
     */
    public V00003personasolicitanteFacade getV00003personasolicitanteFacade() {
        return v00003personasolicitanteFacade;
    }

    /**
     * @param v00003personasolicitanteFacade the v00003personasolicitanteFacade
     * to set
     */
    public void setV00003personasolicitanteFacade(V00003personasolicitanteFacade v00003personasolicitanteFacade) {
        this.v00003personasolicitanteFacade = v00003personasolicitanteFacade;
    }

    private List<V00003personasolicitante> personasolicitante;
    private V00003personasolicitante personapaga;
    private V00003personasolicitante personaatendida;

    /**
     * @return the personasolicitante
     */
    public List<V00003personasolicitante> getPersonasolicitante() {
        return personasolicitante;
    }

    /**
     * @param personasolicitante the personasolicitante to set
     */
    public void setPersonasolicitante(List<V00003personasolicitante> personasolicitante) {
        this.personasolicitante = personasolicitante;
    }

    /**
     * @return the personapaga
     */
    public V00003personasolicitante getPersonapaga() {
        return personapaga;
    }

    /**
     * @param personapaga the personapaga to set
     */
    public void setPersonapaga(V00003personasolicitante personapaga) {
        this.personapaga = personapaga;
    }

    /**
     * @return the personaatendida
     */
    public V00003personasolicitante getPersonaatendida() {
        return personaatendida;
    }

    /**
     * @param personaatendida the personaatendida to set
     */
    public void setPersonaatendida(V00003personasolicitante personaatendida) {
        this.personaatendida = personaatendida;
    }

    private V00003personasolicitante agregarcliente;

    /**
     * @return the agregarcliente
     */
    public V00003personasolicitante getAgregarcliente() {
        return agregarcliente;
    }

    /**
     * @param agregarcliente the agregarcliente to set
     */
    public void setAgregarcliente(V00003personasolicitante agregarcliente) {
        this.agregarcliente = agregarcliente;
    }

    public void buttonActionagregarCliente(ActionEvent actionEvent) {
        try {
            agregarcliente.setApellido(agregarcliente.getApellido().toUpperCase());
            agregarcliente.setNombre(agregarcliente.getNombre().toUpperCase());
            v00003personasolicitanteFacade.create(agregarcliente);
            agregarcliente = new V00003personasolicitante();
            personasolicitante = v00003personasolicitanteFacade.findAll();

        } catch (Exception e) {
        }

    }

    public void buttonActionNuevoCliente(ActionEvent actionEvent) {
        try {
            agregarcliente = new V00003personasolicitante();

        } catch (Exception e) {
        }

    }

    public void onRowSelect(SelectEvent event) {
        try {
            v00003personasolicitanteFacade.create(personapaga);
        } catch (Exception e) {
        }

        try {
            BigDecimal id = personapaga.getId();
            BigDecimal idpa = personaatendida.getId();
            solicitud.setIdQuienFactura(id.toBigInteger());
            solicitud.setIdPaciente(idpa.toBigInteger());

        } catch (Exception e) {
        }
        try {
            FacesMessage msg = new FacesMessage("El que paga es:", personapaga.getApellido() + " " + personapaga.getNombre());
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception e) {
        }
    }

    public void onRowUnselect(UnselectEvent event) {
        try {

            FacesMessage msg = new FacesMessage("", "");
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception e) {
        }
    }

    public void onRowSelect1(SelectEvent event) {
        try {
            BigDecimal id = personapaga.getId();
            BigDecimal idpa = personaatendida.getId();
            solicitud.setIdQuienFactura(id.toBigInteger());
            solicitud.setIdPaciente(idpa.toBigInteger());

        } catch (Exception e) {
        }
        try {
            v00003personasolicitanteFacade.create(personaatendida);
        } catch (Exception e) {
        }
        try {

            FacesMessage msg = new FacesMessage("El paciente es:", personaatendida.getApellido() + " " + personaatendida.getNombre());
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception e) {
        }
    }

    public void onRowUnselect1(UnselectEvent event) {
        try {

            FacesMessage msg = new FacesMessage("", "");
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception e) {
        }
    }

    private BigInteger bicondescuento = new BigInteger("0");

    /**
     * @return the bicondescuento
     */
    public BigInteger getBicondescuento() {
        return bicondescuento;
    }

    /**
     * @param bicondescuento the bicondescuento to set
     */
    public void setBicondescuento(BigInteger bicondescuento) {
        this.bicondescuento = bicondescuento;
    }

    public void listen1Descuento(AjaxBehaviorEvent event) {
        String descuento = "";
        BigInteger descuento1 = solicitud.getDescuento();
        if (descuento1.intValue() == 1) {
            descuento = "Sí";
        } else {
            descuento = "No";
        }

        FacesMessage msg = new FacesMessage("Descuento:", descuento);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        LOG.log(Level.INFO, "bundle_key", descuento1);

    }
    private static final Logger LOG = Logger.getLogger(ProformaMB.class.getName());

    /**
     * @return the solicitud
     */
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * @param solicitud the solicitud to set
     */
    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    private BigInteger idsolici;
    List<V00003seqmaxsolicitud> findmaxsolicitud = new ArrayList<>();

    private Boolean controlbotonsolicitud = new Boolean(false);
    private Boolean controlsolicitud = new Boolean(true);
    private Boolean controlclientespagayatendido = new Boolean(true);
    public void buttonActionGuardaSolicitud(ActionEvent actionEvent) {
        try {
            solicitudFacade.create(solicitud);

            findmaxsolicitud = v00003seqmaxsolicitudFacade.findAll();

            setIdsolici(null);

            for (V00003seqmaxsolicitud v00003seqmaxsolicitud : findmaxsolicitud) {
                setIdsolici(v00003seqmaxsolicitud.getIdsolici());
            }
            controlbotonsolicitud = true;
            String toString = idsolici.toString();
            solicitud.setId(new BigDecimal(toString));

            controlclientespagayatendido = false;

        } catch (Exception e) {
        }
    }

    /**
     * @return the idsolici
     */
    public BigInteger getIdsolici() {
        return idsolici;
    }

    /**
     * @param idsolici the idsolici to set
     */
    public void setIdsolici(BigInteger idsolici) {
        this.idsolici = idsolici;
    }

    /**
     * @return the controlsolicitud
     */
    public Boolean getControlsolicitud() {
        return controlsolicitud;
    }

    /**
     * @param controlsolicitud the controlsolicitud to set
     */
    public void setControlsolicitud(Boolean controlsolicitud) {
        this.controlsolicitud = controlsolicitud;
    }

    /**
     * @return the controlbotonsolicitud
     */
    public Boolean getControlbotonsolicitud() {
        return controlbotonsolicitud;
    }

    /**
     * @param controlbotonsolicitud the controlbotonsolicitud to set
     */
    public void setControlbotonsolicitud(Boolean controlbotonsolicitud) {
        this.controlbotonsolicitud = controlbotonsolicitud;
    }

    /**
     * @return the controlclientespagayatendido
     */
    public Boolean getControlclientespagayatendido() {
        return controlclientespagayatendido;
    }

    /**
     * @param controlclientespagayatendido the controlclientespagayatendido to
     * set
     */
    public void setControlclientespagayatendido(Boolean controlclientespagayatendido) {
        this.controlclientespagayatendido = controlclientespagayatendido;
    }

    /**
     * @return the listadeempleadosqueatienden
     */
    public List<V00002empleado> getListadeempleadosqueatienden() {
        return listadeempleadosqueatienden;
    }

    /**
     * @param listadeempleadosqueatienden the listadeempleadosqueatienden to set
     */
    public void setListadeempleadosqueatienden(List<V00002empleado> listadeempleadosqueatienden) {
        this.listadeempleadosqueatienden = listadeempleadosqueatienden;
    }

    private BigDecimal personaquerefiereelexamen = new BigDecimal("-1");

    /**
     * @return the personaquerefiereelexamen
     */
    public BigDecimal getPersonaquerefiereelexamen() {
        return personaquerefiereelexamen;
    }

    /**
     * @param personaquerefiereelexamen the personaquerefiereelexamen to set
     */
    public void setPersonaquerefiereelexamen(BigDecimal personaquerefiereelexamen) {
        this.personaquerefiereelexamen = personaquerefiereelexamen;
    }

    public void buttonActionAgregarReferente(ActionEvent actionEvent) {
        try {

            Solicitudrefiere s = new Solicitudrefiere();
            s.setIdColXExam(new BigDecimal("-1"));
            s.setIdEmpleado(personaquerefiereelexamen.toBigInteger());
            s.setIdSolicitud(solicitud.getId().toBigInteger());
            listarefierequeseregistraenproforma.add(s);

        } catch (Exception e) {
            System.out.println("e = " + e.getLocalizedMessage());
        }
    }
    public void buttonActionLimpiarReferente(ActionEvent actionEvent) {
        try {

            listarefierequeseregistraenproforma.clear();

        } catch (Exception e) {
            System.out.println("e = " + e.getLocalizedMessage());
        }
    }

    /**
     * @return the listarefierequeseregistraenproforma
     */
    public List<Solicitudrefiere> getListarefierequeseregistraenproforma() {
        return listarefierequeseregistraenproforma;
    }

    /**
     * @param listarefierequeseregistraenproforma the
     * listarefierequeseregistraenproforma to set
     */
    public void setListarefierequeseregistraenproforma(List<Solicitudrefiere> listarefierequeseregistraenproforma) {
        this.listarefierequeseregistraenproforma = listarefierequeseregistraenproforma;
    }
    private Solicitudrefiere selecsrefiere = new Solicitudrefiere();
    public void onRowSelect44(SelectEvent event) throws Exception {
        FacesMessage msg = new FacesMessage("Se eliminará el registro del referente", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        listarefierequeseregistraenproforma.remove(selecsrefiere);
    }

    /**
     * @return the selecsrefiere
     */
    public Solicitudrefiere getSelecsrefiere() {
        return selecsrefiere;
    }

    /**
     * @param selecsrefiere the selecsrefiere to set
     */
    public void setSelecsrefiere(Solicitudrefiere selecsrefiere) {
        this.selecsrefiere = selecsrefiere;
    }

    /**
     * @return the listadeempleadosqueatiendentodos
     */
    public List<V00002empleado> getListadeempleadosqueatiendentodos() {
        return listadeempleadosqueatiendentodos;
    }

    /**
     * @param listadeempleadosqueatiendentodos the
     * listadeempleadosqueatiendentodos to set
     */
    public void setListadeempleadosqueatiendentodos(List<V00002empleado> listadeempleadosqueatiendentodos) {
        this.listadeempleadosqueatiendentodos = listadeempleadosqueatiendentodos;
    }
    public void listen1c(AjaxBehaviorEvent event) {

    }

    public void buttonActionGrabaTodo(ActionEvent actionEvent) {

        Iterator<Solicitudrefiere> solirefiiterator = listarefierequeseregistraenproforma.iterator();
        while (solirefiiterator.hasNext()) {
            try {
                Solicitudrefiere next = solirefiiterator.next();
                next.setValorDeudaAlQueRefiere(new Double("0"));
                solicitudrefiereFacade.create(next);

            } catch (Exception e) {
            }

        }
        Iterator<V00005proforma> iterator = lprofdeta.iterator();
        while (iterator.hasNext()) {
            try {
                SolicitudXItem item = new SolicitudXItem();

                V00005proforma next = iterator.next();
                item.setIdSolicitud(solicitud.getId().doubleValue());
                item.setIdIorg(next.getIdIorg());
                item.setDescuento(solicitud.getDescuento());
                item.setPacienteRevisado(new BigInteger("0"));
                BigInteger menosuno = null;
                try {
                    menosuno = next.getPersonaqueatiendealpaciente().toBigInteger();
                    if (menosuno.equals(new BigInteger("-1"))) {
                        menosuno = null;
                    }
                } catch (Exception e) {
                    menosuno = null;
                }

                item.setIdEmpleado(menosuno);
                solicitudXItemFacade.create(item);

            } catch (Exception e) {
                FacesMessage msg = new FacesMessage("Estado", "No se guardo ");
                FacesContext.getCurrentInstance().addMessage(null, msg);
            }

        }
        FacesMessage msg = new FacesMessage("Estado", "Registros agregados");
        FacesContext.getCurrentInstance().addMessage(null, msg);


    }

    @FacesConverter(forClass = V00005proforma.class)
    public static class V00005proformaConv implements Converter {
        
        V00005proforma v00005proforma;
        
        public V00005proformaConv() {
            this.v00005proforma = new V00005proforma();
        }        

        
        @Override
        public Object getAsObject(FacesContext context, UIComponent component, String value) {
            String valor = value;

            ProformaMB controller = (ProformaMB) context.getApplication().getELResolver().
                    getValue(context.getELContext(), null, "proformaMB");
            List<V00005proforma> find = new ArrayList<>();
            find = controller.findModuloPorNombre(new BigInteger(valor));
            V00005proforma v = new V00005proforma();
            for (V00005proforma v00005proforma1 : find) {
                v = v00005proforma1;
            }

            if (v == null) {
                return null;
            } else {
                return v;
            }
            
        }
        
        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
            Object o = value;

            BigInteger id = (value instanceof V00005proforma) ? ((V00005proforma) value).getIdIorg() : null;
            return (id != null) ? String.valueOf(id) : "-20";
            
        }
        
    }
}
