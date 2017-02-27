/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.reciberefiere;

import ec.com.neurotest.entidades.reciberefiere.V002GeneraMensualRefiere;
import ec.com.neurotest.entidades.reciberefiere.V002GeneraMensualRefiere_;
import ec.com.neurotest.fachadas.AbstractFacade;
import java.math.BigInteger;
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
public class V002GeneraMensualRefiereFacade extends AbstractFacade<V002GeneraMensualRefiere> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public V002GeneraMensualRefiereFacade() {
        super(V002GeneraMensualRefiere.class);
    }

    public List<V002GeneraMensualRefiere> findaPagarRefiere(String panio, String pmes, BigInteger pidempl) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V002GeneraMensualRefiere> cq = cb.createQuery(V002GeneraMensualRefiere.class);
        Root<V002GeneraMensualRefiere> root = cq.from(V002GeneraMensualRefiere.class);
        List<Predicate> predicado = new ArrayList<Predicate>();
        predicado.add(cb.equal(root.get(V002GeneraMensualRefiere_.anio), panio));
        predicado.add(cb.equal(root.get(V002GeneraMensualRefiere_.mes), pmes));
        predicado.add(cb.equal(root.get(V002GeneraMensualRefiere_.idempleado), pidempl));
        cq.where(cb.and(predicado.toArray(new Predicate[predicado.size()])));
        List resultList = em.createQuery(cq).setMaxResults(20).setHint("eclipselink.refresh", "true").getResultList();
        int size = resultList.size();
        return resultList;
    }

}
