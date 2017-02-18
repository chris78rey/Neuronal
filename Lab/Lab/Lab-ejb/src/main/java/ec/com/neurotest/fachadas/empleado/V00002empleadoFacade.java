/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.empleado;

import ec.com.neurotest.entidades.empleado.V00002empleado;
import ec.com.neurotest.entidades.empleado.V00002empleado_;
import ec.com.neurotest.fachadas.AbstractFacade;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author crrb
 */
@Stateless
public class V00002empleadoFacade extends AbstractFacade<V00002empleado> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V00002empleadoFacade() {
        super(V00002empleado.class);
    }

    public List<V00002empleado> findReferenteconUtilidad() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V00002empleado> cq = cb.createQuery(V00002empleado.class);
        Root<V00002empleado> root = cq.from(V00002empleado.class);
        cq.where(cb.gt(root.get(V00002empleado_.porcentajeParticipa), 0));
        List resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

}
