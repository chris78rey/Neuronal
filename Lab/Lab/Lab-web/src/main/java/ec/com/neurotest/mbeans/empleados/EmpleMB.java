/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.empleados;

import ec.com.neurotest.entidades.empleado.V00002empleado;
import ec.com.neurotest.negocio.mantenimiento.EmpleadoLocal;
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
@Named(value="empleMB")
@ViewScoped
public class EmpleMB implements Serializable {

    private V00002empleado selected = new V00002empleado();
    private List<V00002empleado> listaDeEmpleados;

    @PostConstruct
    private void init() {
        listaDeEmpleados = findAll();
    }

    public void create(V00002empleado entity) {
        empleado.create(entity);
    }

    public void edit(V00002empleado entity) {
        empleado.edit(entity);
    }

    public void remove(V00002empleado entity) {
        empleado.remove(entity);
    }

    public V00002empleado find(Object id) {
        return empleado.find(id);
    }

    public List<V00002empleado> findAll() {
        return empleado.findAll();
    }

    @EJB
    transient private EmpleadoLocal empleado;


    private static final long serialVersionUID = -2078120782393768131L;

    /**
     * Creates a new instance of empleMB
     */
    public EmpleMB() {
        this.listaDeEmpleados = new ArrayList<>();
    }

    /**
     * @return the selected
     */
    public V00002empleado getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(V00002empleado selected) {
        this.selected = selected;
    }

    /**
     * @return the listaDeEmpleados
     */
    public List<V00002empleado> getListaDeEmpleados() {
        return listaDeEmpleados;
    }

    public void buttonActionNuevo(ActionEvent actionEvent) {
        selected = new V00002empleado();

    }

    public void buttonActionGrabar(ActionEvent actionEvent) {

        selected.setApellido(selected.getApellido().toUpperCase(Locale.US));
        selected.setNombre(selected.getNombre().toUpperCase(Locale.US));
        empleado.create(selected);
        selected = new V00002empleado();
        listaDeEmpleados = findAll();

    }

    public void buttonActionEliminar(ActionEvent actionEvent) {
        empleado.remove(selected);
        selected = new V00002empleado();
        listaDeEmpleados = findAll();
    }

    public void buttonActionActualizar(ActionEvent actionEvent) {
        selected.setApellido(selected.getApellido().toUpperCase(Locale.US));
        selected.setNombre(selected.getNombre().toUpperCase(Locale.US));
        empleado.edit(selected);
        selected = new V00002empleado();
        listaDeEmpleados = findAll();
    }
}
