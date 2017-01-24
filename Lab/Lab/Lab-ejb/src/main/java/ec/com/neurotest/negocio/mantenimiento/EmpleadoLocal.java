/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.empleado.V00002empleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface EmpleadoLocal {

    public void create(V00002empleado entity);

    public void edit(V00002empleado entity);

    public void remove(V00002empleado entity);

    public V00002empleado find(Object id);

    public List<V00002empleado> findAll();

}
