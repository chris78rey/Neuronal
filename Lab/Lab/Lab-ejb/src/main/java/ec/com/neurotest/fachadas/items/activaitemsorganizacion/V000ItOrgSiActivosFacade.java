/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.fachadas.items.activaitemsorganizacion;

import ec.com.neurotest.entidades.items.activaitemsorganizacion.V000ItOrgSiActivos;
import ec.com.neurotest.entidades.items.activaitemsorganizacion.V000ItOrgSiActivos_;
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
public class V000ItOrgSiActivosFacade extends AbstractFacade<V000ItOrgSiActivos> {

    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public V000ItOrgSiActivosFacade() {
        super(V000ItOrgSiActivos.class);
    }

    public List<V000ItOrgSiActivos> findItemsActivosByOrganizacionActivos(BigInteger par) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V000ItOrgSiActivos> cq = cb.createQuery(V000ItOrgSiActivos.class);
        Root<V000ItOrgSiActivos> root = cq.from(V000ItOrgSiActivos.class);
        List<Predicate> predicatesAND = new ArrayList<>();
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.idorg), par));
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.activo), new BigInteger("1")));
        cq.where(cb.and(predicatesAND.toArray(new Predicate[predicatesAND.size()])));
        List resultList;
        resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

    public List<V000ItOrgSiActivos> findItemsActivosByOrganizacionNoActivos(BigInteger par) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V000ItOrgSiActivos> cq = cb.createQuery(V000ItOrgSiActivos.class);
        Root<V000ItOrgSiActivos> root = cq.from(V000ItOrgSiActivos.class);
        List<Predicate> predicatesAND = new ArrayList<>();
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.idorg), par));
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.activo), new BigInteger("0")));
        cq.where(cb.and(predicatesAND.toArray(new Predicate[predicatesAND.size()])));
        List resultList;
        resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

    public List<V000ItOrgSiActivos> findItemsASeleccionados(BigInteger par, String descri) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V000ItOrgSiActivos> cq = cb.createQuery(V000ItOrgSiActivos.class);
        Root<V000ItOrgSiActivos> root = cq.from(V000ItOrgSiActivos.class);
        List<Predicate> predicatesAND = new ArrayList<>();
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.idorg), par));
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.activo), new BigInteger("0")));
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.descripcion), descri));
        cq.where(cb.and(predicatesAND.toArray(new Predicate[predicatesAND.size()])));
        List resultList;
        resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

    public List<V000ItOrgSiActivos> findTodosLosItemsSinDiscriminaractivosiInactivos(BigInteger par, String descri) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<V000ItOrgSiActivos> cq = cb.createQuery(V000ItOrgSiActivos.class);
        Root<V000ItOrgSiActivos> root = cq.from(V000ItOrgSiActivos.class);
        List<Predicate> predicatesAND = new ArrayList<>();
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.idorg), par));
//        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.activo), new BigInteger("0")));
        predicatesAND.add(cb.equal(root.get(V000ItOrgSiActivos_.descripcion), descri));
        cq.where(cb.and(predicatesAND.toArray(new Predicate[predicatesAND.size()])));
        List resultList;
        resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

}
