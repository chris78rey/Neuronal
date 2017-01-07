/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.managedbeans;

import ec.com.neurotest.entidades.T00101usuarios;
import ec.com.neurotest.sesiones.T00101usuariosFacadeLocal;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author crrb
 */
@Named(value = "mb1")
@ViewScoped
public class Mb1 implements Serializable {

    private static final long serialVersionUID = -5248346246770859304L;

    @EJB
    private T00101usuariosFacadeLocal t00101usuariosFacade;
    private T00101usuarios t00101usuarios = new T00101usuarios();

    @PostConstruct
    private void init() {
        t00101usuarios = t00101usuariosFacade.find(new BigDecimal("102"));
    }

    /**
     * Creates a new instance of Mb1
     */
    public Mb1() {
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
