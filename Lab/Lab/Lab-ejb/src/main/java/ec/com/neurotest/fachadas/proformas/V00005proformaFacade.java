/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.proformas;

import ec.com.neurotest.entidades.proformas.V00005proforma;
import ec.com.neurotest.entidades.proformas.V00005proforma_;
import ec.com.neurotest.fachadas.AbstractFacade;
import java.math.BigInteger;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author crrb
 */
@Stateless
public class V00005proformaFacade extends AbstractFacade<V00005proforma> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V00005proformaFacade() {
        super(V00005proforma.class);
    }

    public List<V00005proforma> findModuloPorNombre(BigInteger par) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V00005proforma> cq = cb.createQuery(V00005proforma.class);
        Root<V00005proforma> root = cq.from(V00005proforma.class);
        cq.where(cb.equal(root.get(V00005proforma_.idIorg), par));
        List resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

    /**
     *
     * @param pnumerosolicitud
     */
    public void crearcabeceraycacularreferencias(String pnumerosolicitud) {
        try {
            StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("P_CALCULA_FACTURAS");
// set parameters
            storedProcedure.registerStoredProcedureParameter("p_numerosolicitud", String.class, ParameterMode.IN);
            storedProcedure.setParameter("p_numerosolicitud", pnumerosolicitud);
// execute SP
            storedProcedure.execute();

        } catch (Exception e) {
        }

    }
}
