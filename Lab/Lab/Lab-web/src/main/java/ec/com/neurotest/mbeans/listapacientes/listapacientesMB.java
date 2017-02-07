/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.listapacientes;

import ec.com.neurotest.entidades.listapacientes.V00010listapacienteshoy;
import ec.com.neurotest.entidades.solicxitem.SolicitudXItem;
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
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author crrb
 */
@Named(value="listapacientesMB")
@ViewScoped
public class listapacientesMB implements Serializable {

    @EJB
    transient private SolicitudXItemFacade solicitudXItemFacade;
    SolicitudXItem solicitudXItem;
    @EJB
    transient private V00010listapacienteshoyFacade v00010listapacienteshoyFacade;


    private V00010listapacienteshoy selected;

    private List<V00010listapacienteshoy> listapacientes = new ArrayList<>();

    @PostConstruct
    private void init() {
        listapacientes = v00010listapacienteshoyFacade.findAll();
    }

    /** Creates a new instance of listapacientesMB */
    public listapacientesMB() {
        this.solicitudXItem = new SolicitudXItem();
        this.selected = new V00010listapacienteshoy();
    }
    private static final Logger LOG = Logger.getLogger(listapacientesMB.class.getName());

    public void buttonAction(ActionEvent actionEvent) {
        try {
            BigInteger id = selected.getId();
            BigDecimal bigDecimal = new BigDecimal(id);
            solicitudXItem = solicitudXItemFacade.find(bigDecimal);
            solicitudXItem.setPacienteRevisado(BigInteger.ONE);
            solicitudXItemFacade.edit(solicitudXItem);
            listapacientes = v00010listapacienteshoyFacade.findAll();

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

}
