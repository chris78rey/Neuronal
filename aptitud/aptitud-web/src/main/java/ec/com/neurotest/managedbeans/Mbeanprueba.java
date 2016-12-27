/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.managedbeans;

import ec.com.neurotest.entidades.T00101usuarios;
import ec.com.neurotest.sesiones.T00101usuariosFacadeLocal;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;

/**
 *
 * @author crrb
 */
@Named(value = "mbeanprueba")
@ViewScoped
public class Mbeanprueba implements Serializable {

    private T00101usuarios t00101usuarios = new T00101usuarios();

    private static final long serialVersionUID = -6409991910683707991L;
    private static final Logger LOG = Logger.getLogger(Mbeanprueba.class.getName());

    public void buttonAction(ActionEvent actionEvent) {
        try {

            t00101usuarios.setApellido(t00101usuarios.getApellido().toUpperCase());
            t00101usuarios.setNombre(t00101usuarios.getNombre().toUpperCase());
            t00101usuarios.setDireccion(t00101usuarios.getDireccion().toUpperCase());
            t00101usuariosFacade.create(getT00101usuarios());
            LOG.log(Level.INFO, "se grabo");
            setT00101usuarios(new T00101usuarios());
        } catch (Exception exception) {
            LOG.log(Level.INFO, "No se grabo");

        }

    }

    public void buttonAction2(ActionEvent actionEvent) {
        setT00101usuarios(new T00101usuarios());
    }

    public List<T00101usuarios> getTfindAll() {
        return t00101usuariosFacade.findAll();
    }

    @EJB
    private T00101usuariosFacadeLocal t00101usuariosFacade;

    /**
     * Creates a new instance of Mbeanprueba
     */
    public Mbeanprueba() {
    }

    /**
     * @return the t00101usuarios
     */
    public T00101usuarios getT00101usuarios() {
        return t00101usuarios;
    }

    /**
     * @param t00101usuarios the t00101usuarios to set
     */
    public void setT00101usuarios(T00101usuarios t00101usuarios) {
        this.t00101usuarios = t00101usuarios;
    }

}
