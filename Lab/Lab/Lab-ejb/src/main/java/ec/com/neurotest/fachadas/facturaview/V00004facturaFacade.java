/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.facturaview;

import ec.com.neurotest.entidades.facturaview.V00004factura;
import ec.com.neurotest.entidades.facturaview.V00004factura_;
import ec.com.neurotest.fachadas.AbstractFacade;
import java.math.BigInteger;
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
public class V00004facturaFacade extends AbstractFacade<V00004factura> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V00004facturaFacade() {
        super(V00004factura.class);
    }

    public List<V00004factura> findbyNumeroSoliFactura(BigInteger numerosol) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V00004factura> cq = cb.createQuery(V00004factura.class);
        Root<V00004factura> root = cq.from(V00004factura.class);
        cq.where(cb.equal(root.get(V00004factura_.id), numerosol));
        List resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

}
