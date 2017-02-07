/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.solicitudmap.Solicitud;
import ec.com.neurotest.fachadas.solicitudmap.SolicitudFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author crrb
 */
@Stateless
@LocalBean
public class GuardaCabeceraSolicitud {

    public void create(Solicitud entity) {
        solicitudFacade.create(entity);
    }

    public void edit(Solicitud entity) {
        solicitudFacade.edit(entity);
    }

    public void remove(Solicitud entity) {
        solicitudFacade.remove(entity);
    }

    public Solicitud find(Object id) {
        return solicitudFacade.find(id);
    }

    public List<Solicitud> findAll() {
        return solicitudFacade.findAll();
    }

    public List<Solicitud> findRange(int[] range) {
        return solicitudFacade.findRange(range);
    }

    public int count() {
        return solicitudFacade.count();
    }

    @EJB
    private SolicitudFacade solicitudFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
