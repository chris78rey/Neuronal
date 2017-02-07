/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.items.Items;
import ec.com.neurotest.entidades.items.Items_;
import ec.com.neurotest.fachadas.items.ItemsFacade;
import java.util.List;
import javax.ejb.EJB;
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
public class ReglasNegocio implements ReglasNegocioLocal {

//    laboratorio
    @Override
    public void create(Items entity) {
        itemsFacade.create(entity);
    }

    @Override
    public void edit(Items entity) {
        itemsFacade.edit(entity);
    }

    @Override
    public void remove(Items entity) {
        itemsFacade.remove(entity);
    }

    public Items find(Object id) {
        return itemsFacade.find(id);
    }

    @Override
    public int count() {
        return itemsFacade.count();
    }

    @EJB
    private ItemsFacade itemsFacade;
    @PersistenceContext(unitName = "ec.com.neurotest_Lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    /**
     *
     * @return
     */
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Items> getListaItemsLaboratorio() {
        List<Items> lista = itemsFacade.findAll();
        int size = lista.size();
        return lista;
    }
    @Override
    public List<Items> getListaItemsLaboratoriosingrupos() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Items> cq = cb.createQuery(Items.class);
        Root<Items> root = cq.from(Items.class);
        cq.where(cb.isNotNull(root.get(Items_.idfk)));
        List resultList = em.createQuery(cq).setMaxResults(1000).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

    @Override
    public List<Items> getListaGruposExamenesImagenes() {
        return itemsFacade.listaGruposExamenesImagenes();
    }

//fin laboratorio
}
