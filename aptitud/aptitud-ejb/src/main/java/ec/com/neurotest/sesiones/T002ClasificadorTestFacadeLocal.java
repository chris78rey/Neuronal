/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T002ClasificadorTest;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T002ClasificadorTestFacadeLocal {

    void create(T002ClasificadorTest t002ClasificadorTest);

    void edit(T002ClasificadorTest t002ClasificadorTest);

    void remove(T002ClasificadorTest t002ClasificadorTest);

    T002ClasificadorTest find(Object id);

    List<T002ClasificadorTest> findAll();

    List<T002ClasificadorTest> findRange(int[] range);

    int count();
    
}
