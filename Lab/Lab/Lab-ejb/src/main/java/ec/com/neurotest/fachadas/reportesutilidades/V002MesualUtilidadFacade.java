/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.reportesutilidades;

import ec.com.neurotest.entidades.reportesutilidades.V002MesualUtilidad;
import ec.com.neurotest.entidades.reportesutilidades.V002MesualUtilidad_;
import ec.com.neurotest.fachadas.AbstractFacade;
import java.util.ArrayList;
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
public class V002MesualUtilidadFacade extends AbstractFacade<V002MesualUtilidad> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V002MesualUtilidadFacade() {
        super(V002MesualUtilidad.class);
    }

    public List<V002MesualUtilidad> findUtilidadMensualByAnioMes(String panio, String pmes) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V002MesualUtilidad> cq = cb.createQuery(V002MesualUtilidad.class);
        Root<V002MesualUtilidad> root = cq.from(V002MesualUtilidad.class);
        List<Predicate> predicates = new ArrayList<Predicate>();
        predicates.add(cb.equal(root.get(V002MesualUtilidad_.anio), panio));
        predicates.add(cb.equal(root.get(V002MesualUtilidad_.mes), pmes));
        cq.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
        List resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }


}
