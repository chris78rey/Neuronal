/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00401inscrmatricula;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00401inscrmatriculaFacadeLocal {

    void create(T00401inscrmatricula t00401inscrmatricula);

    void edit(T00401inscrmatricula t00401inscrmatricula);

    void remove(T00401inscrmatricula t00401inscrmatricula);

    T00401inscrmatricula find(Object id);

    List<T00401inscrmatricula> findAll();

    List<T00401inscrmatricula> findRange(int[] range);

    int count();

}
