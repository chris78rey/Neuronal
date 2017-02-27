/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.mbeans.recibeRefiere;

import ec.com.neurotest.entidades.empleado.V00002empleado;
import ec.com.neurotest.entidades.reciberefiere.V002GeneraMensualRefiere;
import ec.com.neurotest.fachadas.empleado.V00002empleadoFacade;
import ec.com.neurotest.fachadas.reciberefiere.V002GeneraMensualRefiereFacade;
import java.io.Serializable;
import java.math.BigInteger;
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
@Named(value = "recibemensualrefiereMB")
@ViewScoped
public class RecibemensualrefiereMB implements Serializable {

    private String anio = "2017";
    private String mes = "01";

    @EJB
    private V002GeneraMensualRefiereFacade v002GeneraMensualRefiereFacade;
    private List<V002GeneraMensualRefiere> listaRefienen;
    private static final long serialVersionUID = -5420677016535746054L;
    @EJB
    transient private V00002empleadoFacade v00002empleadoFacade;
    private List<V00002empleado> listadeempleadosqueatienden;

    /**
     * Creates a new instance of RecibemensualrefiereMB
     */
    public RecibemensualrefiereMB() {
        this.listaRefienen = new ArrayList<V002GeneraMensualRefiere>();
        this.listadeempleadosqueatienden = new ArrayList<>();
    }

    @PostConstruct
    private void init() {
        setListadeempleadosqueatienden(v00002empleadoFacade.findReferenteconUtilidad());
        listaRefienen = v002GeneraMensualRefiereFacade.findaPagarRefiere("0", "0", BigInteger.ZERO);
    }

    public List<V00002empleado> getListadeempleadosqueatienden() {
        return listadeempleadosqueatienden;
    }

    /**
     * @param listadeempleadosqueatienden the listadeempleadosqueatienden to set
     */
    public void setListadeempleadosqueatienden(List<V00002empleado> listadeempleadosqueatienden) {
        this.listadeempleadosqueatienden = listadeempleadosqueatienden;
    }

    private BigInteger personaquerefiereelexamen = new BigInteger("-1");

    /**
     * @return the personaquerefiereelexamen
     */
    public BigInteger getPersonaquerefiereelexamen() {
        return personaquerefiereelexamen;
    }

    /**
     * @param personaquerefiereelexamen the personaquerefiereelexamen to set
     */
    public void setPersonaquerefiereelexamen(BigInteger personaquerefiereelexamen) {
        this.personaquerefiereelexamen = personaquerefiereelexamen;
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

    /**
     * @return the listaRefienen
     */
    public List<V002GeneraMensualRefiere> getListaRefienen() {
        return listaRefienen;
    }

    /**
     * @param listaRefienen the listaRefienen to set
     */
    public void setListaRefienen(List<V002GeneraMensualRefiere> listaRefienen) {
        this.listaRefienen = listaRefienen;
    }

    public void buttonAction(ActionEvent actionEvent) {
        try {
            listaRefienen = v002GeneraMensualRefiereFacade.findaPagarRefiere(anio, mes, personaquerefiereelexamen);
            addMessage("El año es:" + anio);
            addMessage("El mes es:" + mes);
        } catch (Exception ex) {

        }

    }

    private double valorDeudaAlQueRefiere = 0;

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    /**
     * @return the valorDeudaAlQueRefiere
     */
    public String getValorDeudaAlQueRefiereString() {
        String result = "0.00";
        try {
            valorDeudaAlQueRefiere = 0;
            for (V002GeneraMensualRefiere v002GeneraMensualRefiere : listaRefienen) {
                valorDeudaAlQueRefiere += v002GeneraMensualRefiere.getValorDeudaAlQueRefiere();
            }
            result = String.format("%.2f", valorDeudaAlQueRefiere);
        } catch (Exception e) {
        }
        return result;
    }

    /**
     * @param valorDeudaAlQueRefiere the valorDeudaAlQueRefiere to set
     */
    public void setValorDeudaAlQueRefiere(double valorDeudaAlQueRefiere) {
        this.valorDeudaAlQueRefiere = valorDeudaAlQueRefiere;
    }
}
