/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00101usuarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00101usuariosFacadeLocal {

    void create(T00101usuarios t00101usuarios);

    void edit(T00101usuarios t00101usuarios);

    void remove(T00101usuarios t00101usuarios);

    T00101usuarios find(Object id);

    List<T00101usuarios> findAll();

    List<T00101usuarios> findRange(int[] range);

    int count();
    
}
