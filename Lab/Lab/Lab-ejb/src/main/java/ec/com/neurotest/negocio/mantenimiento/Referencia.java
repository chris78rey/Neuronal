/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.medicorefiere.V00001medicorefiere;
import ec.com.neurotest.fachadas.medicorefiere.V00001medicorefiereFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author crrb
 */
@Stateless
public class Referencia implements ReferenciaLocal {

    @EJB
    private V00001medicorefiereFacade v00001medicorefiereFacade;

    public void create(V00001medicorefiere entity) {
        v00001medicorefiereFacade.create(entity);
    }

    public void edit(V00001medicorefiere entity) {
        v00001medicorefiereFacade.edit(entity);
    }

    public void remove(V00001medicorefiere entity) {
        v00001medicorefiereFacade.remove(entity);
    }

    public V00001medicorefiere find(Object id) {
        return v00001medicorefiereFacade.find(id);
    }

    public List<V00001medicorefiere> findAll() {
        return v00001medicorefiereFacade.findAll();
    }

    public List<V00001medicorefiere> findRange(int[] range) {
        return v00001medicorefiereFacade.findRange(range);
    }

    public int count() {
        return v00001medicorefiereFacade.count();
    }

}
