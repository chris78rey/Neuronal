/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.items;

import ec.com.neurotest.entidades.items.Items;
import ec.com.neurotest.entidades.items.Items_;
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
public class ItemsFacade extends AbstractFacade<Items> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemsFacade() {
        super(Items.class);
    }

    public List<Items> listaGruposExamenesImagenes() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Items> cq = cb.createQuery(Items.class);
        Root<Items> root = cq.from(Items.class);
        cq.where(cb.isNull(root.get(Items_.idfk)));
        List resultList = em.createQuery(cq).setMaxResults(20).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }


}
