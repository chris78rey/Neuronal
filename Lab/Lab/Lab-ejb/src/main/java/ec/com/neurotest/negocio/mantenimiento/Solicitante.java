/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.solicitante.V00003personasolicitante;
import ec.com.neurotest.fachadas.solicitante.V00003personasolicitanteFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author crrb
 */
@Stateless
public class Solicitante implements SolicitanteLocal {

    @Override
    public void create(V00003personasolicitante entity) {
        v00003personasolicitanteFacade.create(entity);
    }

    @Override
    public void edit(V00003personasolicitante entity) {
        v00003personasolicitanteFacade.edit(entity);
    }

    @Override
    public void remove(V00003personasolicitante entity) {
        v00003personasolicitanteFacade.remove(entity);
    }

    @Override
    public V00003personasolicitante find(Object id) {
        return v00003personasolicitanteFacade.find(id);
    }

    @Override
    public List<V00003personasolicitante> findAll() {
        return v00003personasolicitanteFacade.findAll();
    }

    @Override
    public List<V00003personasolicitante> findRange(int[] range) {
        return v00003personasolicitanteFacade.findRange(range);
    }

    @Override
    public int count() {
        return v00003personasolicitanteFacade.count();
    }

    @EJB
    private V00003personasolicitanteFacade v00003personasolicitanteFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
