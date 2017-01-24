/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.items.Items;
import ec.com.neurotest.fachadas.items.ItemsFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

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
    public List<Items> getListaGruposExamenesImagenes() {
        return itemsFacade.listaGruposExamenesImagenes();
    }

//fin laboratorio
}
