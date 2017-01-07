/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00402inscripcionusuarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00402inscripcionusuariosFacadeLocal {

    void create(T00402inscripcionusuarios t00402inscripcionusuarios);

    void edit(T00402inscripcionusuarios t00402inscripcionusuarios);

    void remove(T00402inscripcionusuarios t00402inscripcionusuarios);

    T00402inscripcionusuarios find(Object id);

    List<T00402inscripcionusuarios> findAll();

    List<T00402inscripcionusuarios> findRange(int[] range);

    int count();

}
