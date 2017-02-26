/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.generafactura;

import ec.com.neurotest.entidades.generafactura.V001GeneraFactura;
import ec.com.neurotest.fachadas.generafactura.V001GeneraFacturaFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author crrb
 */
@Named(value="generaFacturaMB")
@ViewScoped
public class GeneraFacturaMB implements Serializable {

    private static final long serialVersionUID = -384291824846758482L;
    private V001GeneraFactura registroSeleccionado;
    private List<V001GeneraFactura> listaGeneraFactura;
    @EJB
    transient private V001GeneraFacturaFacade v001GeneraFacturaFacade;

    @PostConstruct
    private void init() {
        listaGeneraFactura = v001GeneraFacturaFacade.findAll();
    }

    /**
     * Creates a new instance of GeneraFacturaMB
     */
    public GeneraFacturaMB() {
        this.listaGeneraFactura = new ArrayList<>();
        this.registroSeleccionado = new V001GeneraFactura();
    }

    /**
     * @return the registroSeleccionado
     */
    public V001GeneraFactura getRegistroSeleccionado() {
        return registroSeleccionado;
    }

    /**
     * @param registroSeleccionado the registroSeleccionado to set
     */
    public void setRegistroSeleccionado(V001GeneraFactura registroSeleccionado) {
        this.registroSeleccionado = registroSeleccionado;
    }

    /**
     * @return the listaGeneraFactura
     */
    public List<V001GeneraFactura> getListaGeneraFactura() {
        return listaGeneraFactura;
    }

    /**
     * @param listaGeneraFactura the listaGeneraFactura to set
     */
    public void setListaGeneraFactura(List<V001GeneraFactura> listaGeneraFactura) {
        this.listaGeneraFactura = listaGeneraFactura;
    }

    public void onRowSelect(SelectEvent event) {

        try {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
            session.setAttribute("registroSeleccionado", registroSeleccionado);
        } catch (Exception ex) {

        }

        FacesMessage msg = new FacesMessage("Item Seleccionado", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
