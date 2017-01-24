/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.empleado.V00002empleado;
import ec.com.neurotest.fachadas.empleado.V00002empleadoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author crrb
 */
@Stateless
public class Empleado implements EmpleadoLocal {

    @Override
    public void create(V00002empleado entity) {
        v00002empleadoFacade.create(entity);
    }
    @Override
    public void edit(V00002empleado entity) {
        v00002empleadoFacade.edit(entity);
    }
    @Override
    public void remove(V00002empleado entity) {
        v00002empleadoFacade.remove(entity);
    }
    @Override
    public V00002empleado find(Object id) {
        return v00002empleadoFacade.find(id);
    }

    /**
     *
     * @return
     */
    @Override
    public List<V00002empleado> findAll() {
        return v00002empleadoFacade.findAll();
    }

    @EJB
    private V00002empleadoFacade v00002empleadoFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
