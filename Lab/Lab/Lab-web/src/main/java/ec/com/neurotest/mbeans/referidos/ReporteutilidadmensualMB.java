/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.mbeans.referidos;

import ec.com.neurotest.entidades.reportesutilidades.V002MesualUtilidad;
import ec.com.neurotest.fachadas.reportesutilidades.V002MesualUtilidadFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author crrb
 */
@Named(value = "reporteutilidadmensualMB")
@ViewScoped
public class ReporteutilidadmensualMB implements Serializable {

    private static final long serialVersionUID = -1197938119932062043L;
    private String anio = "";
    private String mes = "";

    //<editor-fold defaultstate="collapsed" desc="ejbs">
    @EJB
    transient private V002MesualUtilidadFacade v002MesualUtilidadFacade;
    private List<V002MesualUtilidad> listareporteutilidadmensual;
    //</editor-fold>

    @PostConstruct
    private void init() {

        listareporteutilidadmensual = v002MesualUtilidadFacade.findUtilidadMensualByAnioMes("0", "0");
    }

    /**
     * Creates a new instance of ReporteutilidadmensualMB
     */
    public ReporteutilidadmensualMB() {
        this.listareporteutilidadmensual = new ArrayList<>();
    }

    /**
     * @return the listareporteutilidadmensual
     */
    public List<V002MesualUtilidad> getListareporteutilidadmensual() {
        return listareporteutilidadmensual;
    }

    /**
     * @param listareporteutilidadmensual the listareporteutilidadmensual to set
     */
    public void setListareporteutilidadmensual(List<V002MesualUtilidad> listareporteutilidadmensual) {
        this.listareporteutilidadmensual = listareporteutilidadmensual;
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    private String total = "0.00";

    public void buttonAction(ActionEvent actionEvent) {
        double parseDouble = 0;
        listareporteutilidadmensual = v002MesualUtilidadFacade.findUtilidadMensualByAnioMes(anio, mes);
        for (V002MesualUtilidad v002MesualUtilidad : listareporteutilidadmensual) {
            String totalPorItem = v002MesualUtilidad.getTotalPorItem();
            parseDouble += Double.parseDouble(totalPorItem);
        }
        String result;
        result = String.format("%.2f", parseDouble);
        total = result;
        addMessage("Listo!!");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

}
