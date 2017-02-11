/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.mbeans.items.mbeansitems;

import ec.com.neurotest.entidades.items.activaitemsorganizacion.V000ItOrgSiActivos;
import ec.com.neurotest.entidades.organizacion.Organizacion;
import ec.com.neurotest.fachadas.items.activaitemsorganizacion.V000ItOrgSiActivosFacade;
import ec.com.neurotest.fachadas.itemsxorganiz.V000ItemsXOrganizFacade;
import ec.com.neurotest.fachadas.organizacion.OrganizacionFacade;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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

/**
 *
 *
 *
 * sone
 *
 * @author crrb
 */
@Named(value = "itemsxorganizMB")
@ViewScoped
public class ItemsxorganizMB implements Serializable {
    private String valorSeleccionado = "";
    @EJB
    private V000ItOrgSiActivosFacade v000ItOrgSiActivosFacade;
    private V000ItOrgSiActivos selected = new V000ItOrgSiActivos();
    private V000ItOrgSiActivos selectedlista;

    @EJB
    transient private V000ItemsXOrganizFacade v000ItemsXOrganizFacade;
    private List<V000ItOrgSiActivos> listaSource = new ArrayList<>();
    private List<V000ItOrgSiActivos> listaTarget = new ArrayList<>();
    private List<V000ItOrgSiActivos> listadeactivosactivos;

    @EJB
    transient private OrganizacionFacade organizacionFacade;

    private static final long serialVersionUID = 3758564078568749687L;
    private BigDecimal seleccionOrganizacion = new BigDecimal(BigInteger.ZERO);
    private List<Organizacion> listOrganizacioncombo;

    public ItemsxorganizMB() {
        this.selectedlista = new V000ItOrgSiActivos();
        this.listadeactivosactivos = new ArrayList<>();
    }

    @PostConstruct
    private void init() {
        listOrganizacioncombo = organizacionFacade.findAll();
        listaSource = getV000ItOrgSiActivosFacade().findItemsActivosByOrganizacionNoActivos(BigInteger.ZERO);
        int size = listaSource.size();
        setListadeactivosactivos(getV000ItOrgSiActivosFacade().findItemsActivosByOrganizacionActivos(BigInteger.ZERO));
    }
    /**
     * @return the seleccionOrganizacion
     */
    public BigDecimal getSeleccionOrganizacion() {
        return seleccionOrganizacion;
    }

    /**
     * @param seleccionOrganizacion the seleccionOrganizacion to set
     */
    public void setSeleccionOrganizacion(BigDecimal seleccionOrganizacion) {
        this.seleccionOrganizacion = seleccionOrganizacion;
    }

    /**
     * @return the listOrganizacioncombo
     */
    public List<Organizacion> getListOrganizacioncombo() {
        return listOrganizacioncombo;
    }

    /**
     * @param listOrganizacioncombo the listOrganizacioncombo to set
     */
    public void setListOrganizacioncombo(List<Organizacion> listOrganizacioncombo) {
        this.listOrganizacioncombo = listOrganizacioncombo;
    }
    public void listen1(AjaxBehaviorEvent event) {

        setListaSource(getV000ItOrgSiActivosFacade().findItemsActivosByOrganizacionNoActivos(seleccionOrganizacion.toBigInteger()));

        setListadeactivosactivos(getV000ItOrgSiActivosFacade().findItemsActivosByOrganizacionActivos(seleccionOrganizacion.toBigInteger()));


    }
    private static final Logger LOG = Logger.getLogger(ItemsxorganizMB.class.getName());


    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void buttonAction(ActionEvent actionEvent) {

        selectedlista = v000ItOrgSiActivosFacade.find(new BigInteger(valorSeleccionado));

        selectedlista.setActivo(BigInteger.ONE);
        getV000ItOrgSiActivosFacade().edit(selectedlista);

        addMessage("Agregado:" + selectedlista.getDescripcion());
        setListaSource(getV000ItOrgSiActivosFacade().findItemsActivosByOrganizacionNoActivos(seleccionOrganizacion.toBigInteger()));


        setListadeactivosactivos(getV000ItOrgSiActivosFacade().findItemsActivosByOrganizacionActivos(seleccionOrganizacion.toBigInteger()));
    }

    /**
     * @return the valorSeleccionado
     */
    public String getValorSeleccionado() {
        return valorSeleccionado;
    }

    /**
     * @param valorSeleccionado the valorSeleccionado to set
     */
    public void setValorSeleccionado(String valorSeleccionado) {
        this.valorSeleccionado = valorSeleccionado;
    }

    /**
     * @return the listaSource
     */
    public List<V000ItOrgSiActivos> getListaSource() {
        return listaSource;
    }

    /**
     * @param listaSource the listaSource to set
     */
    public void setListaSource(List<V000ItOrgSiActivos> listaSource) {
        this.listaSource = listaSource;
    }

    /**
     * @return the selected
     */
    public V000ItOrgSiActivos getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(V000ItOrgSiActivos selected) {
        this.selected = selected;
    }

    /**
     * @return the listadeactivosactivos
     */
    public List<V000ItOrgSiActivos> getListadeactivosactivos() {
        return listadeactivosactivos;
    }

    /**
     * @param listadeactivosactivos the listadeactivosactivos to set
     */
    public void setListadeactivosactivos(List<V000ItOrgSiActivos> listadeactivosactivos) {
        this.listadeactivosactivos = listadeactivosactivos;
    }
    public void buttonActionQuitar(ActionEvent actionEvent) {
        try {
            addMessage("Elemento Eliminado!");
            selected.setActivo(BigInteger.ZERO);
            getV000ItOrgSiActivosFacade().edit(selected);

            setListaSource(getV000ItOrgSiActivosFacade().findItemsActivosByOrganizacionNoActivos(seleccionOrganizacion.toBigInteger()));
            setListadeactivosactivos(getV000ItOrgSiActivosFacade().findItemsActivosByOrganizacionActivos(seleccionOrganizacion.toBigInteger()));

        } catch (Exception e) {
        }

    }

    /**
     * @return the v000ItOrgSiActivosFacade
     */
    public V000ItOrgSiActivosFacade getV000ItOrgSiActivosFacade() {
        return v000ItOrgSiActivosFacade;
    }

    /**
     * @param v000ItOrgSiActivosFacade the v000ItOrgSiActivosFacade to set
     */
    public void setV000ItOrgSiActivosFacade(V000ItOrgSiActivosFacade v000ItOrgSiActivosFacade) {
        this.v000ItOrgSiActivosFacade = v000ItOrgSiActivosFacade;
    }

    /**
     * @return the selectedlista
     */
    public V000ItOrgSiActivos getSelectedlista() {
        return selectedlista;
    }

    /**
     * @param selectedlista the selectedlista to set
     */
    public void setSelectedlista(V000ItOrgSiActivos selectedlista) {
        this.selectedlista = selectedlista;
    }

    @FacesConverter(forClass = V000ItOrgSiActivos.class)
    public static class Converter1 implements Converter {

        V000ItOrgSiActivos v000ItOrgSiActivos;

        public Converter1() {
            this.v000ItOrgSiActivos = new V000ItOrgSiActivos();
        }

        @Override
        public Object getAsObject(FacesContext context, UIComponent component, String value) {
            String valor = value;
            ItemsxorganizMB controller = (ItemsxorganizMB) context.getApplication().getELResolver().
                    getValue(context.getELContext(), null, "itemsxorganizMB");
            V000ItOrgSiActivos find = controller.getV000ItOrgSiActivosFacade().find(new BigInteger(valor));

            if (find == null) {
                return null;
            } else {
                return find;
            }

        }

        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
            Object o = value;

//        id = new BigInteger("0");
//
            BigInteger id = (value instanceof V000ItOrgSiActivos) ? ((V000ItOrgSiActivos) value).getIdIorg() : null;
            return (id != null) ? String.valueOf(id) : "-20";

        }

    }

}
