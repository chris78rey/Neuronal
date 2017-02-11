/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.items.mbeansitems;

import ec.com.neurotest.entidades.items.Items;
import ec.com.neurotest.negocio.mantenimiento.ReglasNegocioLocal;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author crrb
 */
@Named(value="itemMB")
@ViewScoped
public class ItemMB implements Serializable {

    @EJB
    transient private ReglasNegocioLocal reglasNegocio;
    private Items selected;

    private static final long serialVersionUID = -700952608030017417L;

    /**
     * Creates a new instance of ItemMB
     */
    int refrescar = 0;
    public ItemMB() {
        selected = new Items();
    }

    private List<Items> list1;

    public List<Items> getListaGruposExamenesImagenes() {
        return reglasNegocio.getListaGruposExamenesImagenes();
    }

    @PostConstruct
    private void init() {
        list1 = reglasNegocio.getListaItemsLaboratorio();
    }

    /**
     * @return the list1
     */
    public List<Items> getList1() {

        return list1;
    }

    /**
     * @return the selected
     */
    public Items getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(Items selected) {
        this.selected = selected;
    }

    public void buttonActionNuevo(ActionEvent actionEvent) {

        selected = new Items();
        list1 = reglasNegocio.getListaItemsLaboratorio();

    }

    public void buttonActionGrabar(ActionEvent actionEvent) {
        refrescar = 0;
        selected.setDescripcion(selected.getDescripcion().toUpperCase(Locale.US));
        create(selected);

        list1 = reglasNegocio.getListaItemsLaboratorio();
        selected = new Items();

    }

    public void buttonActionEliminar(ActionEvent actionEvent) {
        selected.setActivo(BigInteger.ZERO);
        edit(selected);

        list1 = reglasNegocio.getListaItemsLaboratorio();
        selected = new Items();

    }

    public void buttonActionActualizar(ActionEvent actionEvent) {
        refrescar = 0;
        selected.setDescripcion(selected.getDescripcion().toUpperCase(Locale.US));
        edit(selected);

        list1 = reglasNegocio.getListaItemsLaboratorio();
        selected = new Items();
    }


    public void create(Items entity) {
        reglasNegocio.create(entity);
    }

    public void edit(Items entity) {
        reglasNegocio.edit(entity);
    }

}
