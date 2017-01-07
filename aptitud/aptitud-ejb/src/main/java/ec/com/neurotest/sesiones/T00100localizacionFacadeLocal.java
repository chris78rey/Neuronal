/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00100localizacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00100localizacionFacadeLocal {

    void create(T00100localizacion t00100localizacion);

    void edit(T00100localizacion t00100localizacion);

    void remove(T00100localizacion t00100localizacion);

    T00100localizacion find(Object id);

    List<T00100localizacion> findAll();

    List<T00100localizacion> findRange(int[] range);

    int count();

}
