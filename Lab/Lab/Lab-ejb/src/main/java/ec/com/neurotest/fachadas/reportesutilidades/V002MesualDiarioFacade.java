/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.reportesutilidades;

import ec.com.neurotest.entidades.reportesutilidades.V002MesualDiario;
import ec.com.neurotest.entidades.reportesutilidades.V002MesualDiario_;
import ec.com.neurotest.fachadas.AbstractFacade;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author crrb
 */
@Stateless
public class V002MesualDiarioFacade extends AbstractFacade<V002MesualDiario> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V002MesualDiarioFacade() {
        super(V002MesualDiario.class);
    }

    public List<V002MesualDiario> findbyFechaSolicitud(Date pfechaSolicitud) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V002MesualDiario> cq = cb.createQuery(V002MesualDiario.class);
        Root<V002MesualDiario> root = cq.from(V002MesualDiario.class);
        List<Predicate> predicates = new ArrayList<Predicate>();
        predicates.add(cb.equal(root.get(V002MesualDiario_.fechaSolicitud), pfechaSolicitud));
        cq.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
        List resultList = em.createQuery(cq).setMaxResults(20).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

}
