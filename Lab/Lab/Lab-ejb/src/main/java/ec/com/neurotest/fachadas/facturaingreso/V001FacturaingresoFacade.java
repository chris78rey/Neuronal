/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.facturaingreso;

import ec.com.neurotest.entidades.facturaingreso.V001Facturaingreso;
import ec.com.neurotest.entidades.facturaingreso.V001Facturaingreso_;
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
public class V001FacturaingresoFacade extends AbstractFacade<V001Facturaingreso> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V001FacturaingresoFacade() {
        super(V001Facturaingreso.class);
    }

    public List<V001Facturaingreso> findCabecerasBysolicitudes(String par) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V001Facturaingreso> cq = cb.createQuery(V001Facturaingreso.class);
        Root<V001Facturaingreso> root = cq.from(V001Facturaingreso.class);
        List<Predicate> predicatesOR = new ArrayList<Predicate>();
        predicatesOR.add(cb.equal(root.get(V001Facturaingreso_.idsolicitud), par.toUpperCase()));
        cq.where(cb.or(predicatesOR.toArray(new Predicate[predicatesOR.size()])));
        List resultList = em.createQuery(cq).setMaxResults(20).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }


}
