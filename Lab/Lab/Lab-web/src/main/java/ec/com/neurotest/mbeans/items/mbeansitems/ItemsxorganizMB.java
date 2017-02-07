/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.mbeans.items.mbeansitems;

import ec.com.neurotest.entidades.itemsxorganiz.V000ItemsXOrganiz;
import ec.com.neurotest.entidades.organizacion.Organizacion;
import ec.com.neurotest.fachadas.itemsxorganiz.V000ItemsXOrganizFacade;
import ec.com.neurotest.fachadas.organizacion.OrganizacionFacade;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
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

    @EJB
    transient private OrganizacionFacade organizacionFacade;

    private List<Organizacion> listOrganizacioncombo;
    private BigDecimal seleccionOrganizacion;

    private List<V000ItemsXOrganiz> itemsXOrganizs;
    private V000ItemsXOrganiz selected = new V000ItemsXOrganiz();

    @PostConstruct
    private void init() {
        itemsXOrganizs = findByOrganizacion(new BigDecimal("-1"));
        listOrganizacioncombo = organizacionFacade.findAll();
    }

    public void create(V000ItemsXOrganiz entity) {
        v000ItemsXOrganizFacade.create(entity);
    }

    public void listen1(AjaxBehaviorEvent event) {
        itemsXOrganizs = findByOrganizacion(seleccionOrganizacion);
    }

    public void edit(V000ItemsXOrganiz entity) {
        v000ItemsXOrganizFacade.edit(entity);
    }

    public void remove(V000ItemsXOrganiz entity) {
        v000ItemsXOrganizFacade.remove(entity);
    }

    public V000ItemsXOrganiz find(Object id) {
        return v000ItemsXOrganizFacade.find(id);
    }

    public List<V000ItemsXOrganiz> findAll() {
        return v000ItemsXOrganizFacade.findAll();
    }

    public List<V000ItemsXOrganiz> findByOrganizacion(BigDecimal par) {
        return v000ItemsXOrganizFacade.findByOrganizacion(par);
    }

    public List<V000ItemsXOrganiz> findRange(int[] range) {
        return v000ItemsXOrganizFacade.findRange(range);
    }

    public int count() {
        return v000ItemsXOrganizFacade.count();
    }

    @EJB
    transient private V000ItemsXOrganizFacade v000ItemsXOrganizFacade;

    private static final long serialVersionUID = 3758564078568749687L;

    /**
     * Creates a new instance of ItemsxorganizMB
     */
    public ItemsxorganizMB() {
        this.seleccionOrganizacion = new BigDecimal("0");
        this.listOrganizacioncombo = new ArrayList<>();
        this.itemsXOrganizs = new ArrayList<>();
    }

    /**
     * @return the itemsXOrganizs
     */
    public List<V000ItemsXOrganiz> getItemsXOrganizs() {
        return itemsXOrganizs;
    }

    /**
     * @param itemsXOrganizs the itemsXOrganizs to set
     */
    public void setItemsXOrganizs(List<V000ItemsXOrganiz> itemsXOrganizs) {
        this.itemsXOrganizs = itemsXOrganizs;
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
     * @return the selected
     */
    public V000ItemsXOrganiz getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(V000ItemsXOrganiz selected) {
        this.selected = selected;
    }

    public void buttonAction(ActionEvent actionEvent) {
        BigInteger activo = selected.getActivo();
        if (activo.equals(BigInteger.ZERO)) {
            selected.setActivo(BigInteger.ONE);
        } else {
            selected.setActivo(BigInteger.ZERO);
        }
        v000ItemsXOrganizFacade.edit(selected);
        itemsXOrganizs = findByOrganizacion(BigDecimal.ONE);
    }

}
