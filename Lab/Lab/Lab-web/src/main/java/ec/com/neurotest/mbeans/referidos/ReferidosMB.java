/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.referidos;

import ec.com.neurotest.entidades.medicorefiere.V00001medicorefiere;
import ec.com.neurotest.fachadas.medicorefiere.V00001medicorefiereFacade;
import java.io.Serializable;
import java.util.ArrayList;
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
@Named(value="referidosMB")
@ViewScoped
public class ReferidosMB implements Serializable {

    @EJB
    transient private V00001medicorefiereFacade v00001medicorefiereFacade;
    private V00001medicorefiere selected = new V00001medicorefiere();

    public void create(V00001medicorefiere entity) {
        v00001medicorefiereFacade.create(entity);
    }

    public void edit(V00001medicorefiere entity) {
        v00001medicorefiereFacade.edit(entity);
    }

    public void remove(V00001medicorefiere entity) {
        v00001medicorefiereFacade.remove(entity);
    }

    public V00001medicorefiere find(Object id) {
        return v00001medicorefiereFacade.find(id);
    }

    public List<V00001medicorefiere> findAll() {
        List<V00001medicorefiere> findAll = v00001medicorefiereFacade.findAll();
        System.out.println("findAll = " + findAll.size());
        return findAll;
    }

    private static final long serialVersionUID = 890004976207700647L;

    /**
     * Creates a new instance of ReferidosMB
     */
    public ReferidosMB() {
        this.listamedicosRefieren = new ArrayList<>();
    }
    private List<V00001medicorefiere> listamedicosRefieren;

    @PostConstruct
    private void init() {
        listamedicosRefieren = findAll();
    }

    /**
     * @return the listamedicosRefieren
     */
    public List<V00001medicorefiere> getListamedicosRefieren() {
        return listamedicosRefieren;
    }

    /**
     * @param listamedicosRefieren the listamedicosRefieren to set
     */
    public void setListamedicosRefieren(List<V00001medicorefiere> listamedicosRefieren) {
        this.listamedicosRefieren = listamedicosRefieren;
    }

    /**
     * @return the selected
     */
    public V00001medicorefiere getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(V00001medicorefiere selected) {
        this.selected = selected;
    }

    public void buttonActionNuevo(ActionEvent actionEvent) {
        selected = new V00001medicorefiere();

    }
    public void buttonActionGrabar(ActionEvent actionEvent) {
        selected.setApellido(selected.getApellido().toUpperCase(Locale.US));
        selected.setNombre(selected.getNombre().toUpperCase());
        selected.setCentromedico(selected.getCentromedico().toUpperCase());
        v00001medicorefiereFacade.create(selected);
        selected = new V00001medicorefiere();
        listamedicosRefieren = findAll();

    }

    public void buttonActionEliminar(ActionEvent actionEvent) {
        v00001medicorefiereFacade.remove(selected);
        selected = new V00001medicorefiere();
        listamedicosRefieren = findAll();

    }

    public void buttonActionActualizar(ActionEvent actionEvent) {
        selected.setApellido(selected.getApellido().toUpperCase(Locale.US));
        selected.setNombre(selected.getNombre().toUpperCase());
        selected.setCentromedico(selected.getCentromedico().toUpperCase());
        v00001medicorefiereFacade.edit(selected);
        selected = new V00001medicorefiere();
        listamedicosRefieren = findAll();
    }

}
