/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.registroitems.RegistroItems;
import ec.com.neurotest.fachadas.registroitems.RegistroItemsFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author crrb
 */
@Stateless
@LocalBean
public class GrabaFactura {

    public void create(RegistroItems entity) {
        registroItemsFacade.create(entity);
    }

    public void edit(RegistroItems entity) {
        registroItemsFacade.edit(entity);
    }

    public void remove(RegistroItems entity) {
        registroItemsFacade.remove(entity);
    }

    public RegistroItems find(Object id) {
        return registroItemsFacade.find(id);
    }

    public List<RegistroItems> findAll() {
        return registroItemsFacade.findAll();
    }

    public List<RegistroItems> findRange(int[] range) {
        return registroItemsFacade.findRange(range);
    }

    public int count() {
        return registroItemsFacade.count();
    }

    @EJB
    private RegistroItemsFacade registroItemsFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
