/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.itemsxorganiz;

import ec.com.neurotest.entidades.itemsxorganiz.V000ItemsXOrganiz;
import ec.com.neurotest.entidades.itemsxorganiz.V000ItemsXOrganiz_;
import ec.com.neurotest.fachadas.AbstractFacade;
import java.math.BigDecimal;
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
public class V000ItemsXOrganizFacade extends AbstractFacade<V000ItemsXOrganiz> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V000ItemsXOrganizFacade() {
        super(V000ItemsXOrganiz.class);
    }

    public List<V000ItemsXOrganiz> findByOrganizacion(BigDecimal par) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V000ItemsXOrganiz> cq = cb.createQuery(V000ItemsXOrganiz.class);
        Root<V000ItemsXOrganiz> root = cq.from(V000ItemsXOrganiz.class);
        cq.where(cb.equal(root.get(V000ItemsXOrganiz_.idOrg), par));
        List resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

}
