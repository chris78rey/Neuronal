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

    public void buttonAction(ActionEvent actionEvent) {
        t00101usuariosFacade.create(t00101usuarios);
        t00101usuarios = new T00101usuarios();
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
