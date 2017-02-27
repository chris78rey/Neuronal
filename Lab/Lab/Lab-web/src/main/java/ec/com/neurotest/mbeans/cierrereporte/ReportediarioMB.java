/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.cierrereporte;

import ec.com.neurotest.entidades.reportesutilidades.V002MesualDiario;
import ec.com.neurotest.fachadas.reportesutilidades.V002MesualDiarioFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author crrb
 */
@Named(value="reportediarioMB")
@ViewScoped
public class ReportediarioMB implements Serializable {

    @EJB
    private V002MesualDiarioFacade v002MesualDiarioFacade;
    private List<V002MesualDiario> listadiarioutilidad = new ArrayList<>();
    private static final long serialVersionUID = 7294490108957807356L;

    /**
     * Creates a new instance of ReportediarioMB
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;

    public ReportediarioMB() {
    }
    @PostConstruct
    private void init() {
        listadiarioutilidad = v002MesualDiarioFacade.findbyFechaSolicitud(fechaSolicitud);
    }

    /**
     * @return the listadiarioutilidad
     */
    public List<V002MesualDiario> getListadiarioutilidad() {
        return listadiarioutilidad;
    }

    /**
     * @param listadiarioutilidad the listadiarioutilidad to set
     */
    public void setListadiarioutilidad(List<V002MesualDiario> listadiarioutilidad) {
        this.listadiarioutilidad = listadiarioutilidad;
    }

    /**
     * @return the fechaSolicitud
     */
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * @param fechaSolicitud the fechaSolicitud to set
     */
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
    private String totalPorItem = "0.00";
    public void buttonAction(ActionEvent actionEvent) {
        double parseDouble = 0;
        listadiarioutilidad = v002MesualDiarioFacade.findbyFechaSolicitud(fechaSolicitud);
        for (V002MesualDiario v002MesualDiario : listadiarioutilidad) {
            totalPorItem = v002MesualDiario.getTotalPorItem();
            parseDouble += Double.parseDouble(totalPorItem);

        }
        totalPorItem = String.format("%.2f", parseDouble);
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    /**
     * @return the totalPorItem
     */
    public String getTotalPorItem() {
        return totalPorItem;
    }

    /**
     * @param totalPorItem the totalPorItem to set
     */
    public void setTotalPorItem(String totalPorItem) {
        this.totalPorItem = totalPorItem;
    }
}
