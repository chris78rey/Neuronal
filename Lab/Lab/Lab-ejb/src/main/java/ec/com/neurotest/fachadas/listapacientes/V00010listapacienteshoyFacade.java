/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.listapacientes;

import ec.com.neurotest.entidades.listapacientes.V00010listapacienteshoy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crrb
 */
@Stateless
public class V00010listapacienteshoyFacade extends AbstractFacade<V00010listapacienteshoy> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V00010listapacienteshoyFacade() {
        super(V00010listapacienteshoy.class);
    }

}
