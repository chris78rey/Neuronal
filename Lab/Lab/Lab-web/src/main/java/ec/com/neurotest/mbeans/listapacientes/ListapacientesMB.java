/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.listapacientes;

import ec.com.neurotest.entidades.empleado.V00002empleado;
import ec.com.neurotest.entidades.listapacientes.V00010listapacienteshoy;
import ec.com.neurotest.entidades.solicxitem.SolicitudXItem;
import ec.com.neurotest.fachadas.empleado.V00002empleadoFacade;
import ec.com.neurotest.fachadas.listapacientes.V00010listapacienteshoyFacade;
import ec.com.neurotest.fachadas.solicxitem.SolicitudXItemFacade;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author crrb
 */
@Named(value="listapacientesMB")
@ViewScoped
public class ListapacientesMB implements Serializable {

    private static final long serialVersionUID = -7989179097949260870L;

    @EJB
    transient private SolicitudXItemFacade solicitudXItemFacade;
    SolicitudXItem solicitudXItem;
    @EJB
    transient private V00010listapacienteshoyFacade v00010listapacienteshoyFacade;

    @EJB
    transient private V00002empleadoFacade v00002empleadoFacade;
    private List<V00002empleado> listadeempleadosqueatiendentodos;



    private V00010listapacienteshoy selected;

    private List<V00010listapacienteshoy> listapacientes = new ArrayList<>();
    private BigInteger idempleadoseleccionado;
    @PostConstruct
    private void init() {
        listapacientes = v00010listapacienteshoyFacade.findSeleccionaByIdEmpleado(idempleadoseleccionado);
        listadeempleadosqueatiendentodos = v00002empleadoFacade.findAll();
    }

    /** Creates a new instance of listapacientesMB */
    public ListapacientesMB() {
        this.idempleadoseleccionado = new BigInteger("0");
        this.listadeempleadosqueatiendentodos = new ArrayList<>();
        this.listadeempleadosqueatiendentodos = new ArrayList<>();
        this.solicitudXItem = new SolicitudXItem();
        this.selected = new V00010listapacienteshoy();
    }
    private static final Logger LOG = Logger.getLogger(ListapacientesMB.class.getName());

    public void buttonAction(ActionEvent actionEvent) {
        try {
            BigInteger id = selected.getId();
            BigDecimal bigDecimal = new BigDecimal(id);
            solicitudXItem = solicitudXItemFacade.find(bigDecimal);
            solicitudXItem.setPacienteRevisado(BigInteger.ONE);
            solicitudXItemFacade.edit(solicitudXItem);
            listapacientes = v00010listapacienteshoyFacade.findSeleccionaByIdEmpleado(idempleadoseleccionado);

        } catch (Exception e) {

            System.out.println("e = " + e.getLocalizedMessage());
        }

    }

    /**
     * @return the selected
     */
    public V00010listapacienteshoy getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(V00010listapacienteshoy selected) {
        this.selected = selected;
    }

    /**
     * @return the listapacientes
     */
    public List<V00010listapacienteshoy> getListapacientes() {
        return listapacientes;
    }

    /**
     * @param listapacientes the listapacientes to set
     */
    public void setListapacientes(List<V00010listapacienteshoy> listapacientes) {
        this.listapacientes = listapacientes;
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

    /**
     * @return the idempleadoseleccionado
     */
    public BigInteger getIdempleadoseleccionado() {
        return idempleadoseleccionado;
    }

    /**
     * @param idempleadoseleccionado the idempleadoseleccionado to set
     */
    public void setIdempleadoseleccionado(BigInteger idempleadoseleccionado) {
        this.idempleadoseleccionado = idempleadoseleccionado;
    }

    public void listen1(AjaxBehaviorEvent event) {
    }
    public void buttonActionSeleccionaAtiende(ActionEvent actionEvent) {
        listapacientes = v00010listapacienteshoyFacade.findSeleccionaByIdEmpleado(idempleadoseleccionado);

    }

    public void addMessageSeleccionaAtiende(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
