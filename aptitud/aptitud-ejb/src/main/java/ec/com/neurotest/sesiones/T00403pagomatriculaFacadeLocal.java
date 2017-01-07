/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00403pagomatricula;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00403pagomatriculaFacadeLocal {

    void create(T00403pagomatricula t00403pagomatricula);

    void edit(T00403pagomatricula t00403pagomatricula);

    void remove(T00403pagomatricula t00403pagomatricula);

    T00403pagomatricula find(Object id);

    List<T00403pagomatricula> findAll();

    List<T00403pagomatricula> findRange(int[] range);

    int count();

}
