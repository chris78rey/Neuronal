/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.listapacientes;

import ec.com.neurotest.entidades.listapacientes.V00010listapacienteshoy;
import ec.com.neurotest.entidades.listapacientes.V00010listapacienteshoy_;
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

    public List<V00010listapacienteshoy> findSeleccionaByIdEmpleado(BigInteger par) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V00010listapacienteshoy> cq = cb.createQuery(V00010listapacienteshoy.class);
        Root<V00010listapacienteshoy> root = cq.from(V00010listapacienteshoy.class);
        cq.where(cb.equal(root.get(V00010listapacienteshoy_.idEmpleado), par));
        List resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        int size = resultList.size();
        return resultList;
    }

}
