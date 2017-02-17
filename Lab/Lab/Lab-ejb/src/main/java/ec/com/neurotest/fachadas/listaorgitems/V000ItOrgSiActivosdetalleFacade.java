/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.listaorgitems;

import ec.com.neurotest.entidades.listaorgitems.V000ItOrgSiActivosdetalle;
import ec.com.neurotest.entidades.listaorgitems.V000ItOrgSiActivosdetalle_;
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
public class V000ItOrgSiActivosdetalleFacade extends AbstractFacade<V000ItOrgSiActivosdetalle> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V000ItOrgSiActivosdetalleFacade() {
        super(V000ItOrgSiActivosdetalle.class);
    }

    public List<V000ItOrgSiActivosdetalle> findItemsActivopororganizacion(BigInteger par) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V000ItOrgSiActivosdetalle> cq = cb.createQuery(V000ItOrgSiActivosdetalle.class);
        Root<V000ItOrgSiActivosdetalle> root = cq.from(V000ItOrgSiActivosdetalle.class);
        List<Predicate> predicatesAND = new ArrayList<>();
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivosdetalle_.idorg), par));
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivosdetalle_.activo), new BigInteger("1")));
        cq.where(cb.and(predicatesAND.toArray(new Predicate[predicatesAND.size()])));
        List resultList;
        resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

}
