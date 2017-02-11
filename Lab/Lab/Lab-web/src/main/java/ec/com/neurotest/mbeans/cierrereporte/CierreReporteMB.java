/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.neurotest.mbeans.cierrereporte;

import ec.com.neurotest.entidades.cierrereporte.V00011cierre;
import ec.com.neurotest.fachadas.cierrereporte.V00011cierreFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author crrb
 */
@Named(value="cierreReporteMB")
@ViewScoped

public class CierreReporteMB implements Serializable {

    private static final long serialVersionUID = 5071176861162062259L;

    @EJB
    transient private V00011cierreFacade v00011cierreFacade;
    private List<V00011cierre> lcierre = new ArrayList<>();

    @PostConstruct
    private void init() {
        lcierre = v00011cierreFacade.findAll();
    }
    /**
     * Creates a new instance of CierreReporteMB
     */
    public CierreReporteMB() {
    }

    public V00011cierre find(Object id) {
        return v00011cierreFacade.find(id);
    }

    public List<V00011cierre> findAll() {
        return v00011cierreFacade.findAll();
    }

    /**
     * @return the lcierre
     */
    public List<V00011cierre> getLcierre() {
        return lcierre;
    }

    /**
     * @param lcierre the lcierre to set
     */
    public void setLcierre(List<V00011cierre> lcierre) {
        this.lcierre = lcierre;
    }

}
