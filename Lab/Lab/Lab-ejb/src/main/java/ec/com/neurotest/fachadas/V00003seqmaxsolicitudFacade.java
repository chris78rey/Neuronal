/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas;

import ec.com.neurotest.entidades.seqmaxsolicitud.V00003seqmaxsolicitud;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crrb
 */
@Stateless
public class V00003seqmaxsolicitudFacade extends AbstractFacade<V00003seqmaxsolicitud> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V00003seqmaxsolicitudFacade() {
        super(V00003seqmaxsolicitud.class);
    }

}
