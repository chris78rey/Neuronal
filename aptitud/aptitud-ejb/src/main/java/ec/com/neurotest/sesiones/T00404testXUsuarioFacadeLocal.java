/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00404testXUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00404testXUsuarioFacadeLocal {

    void create(T00404testXUsuario t00404testXUsuario);

    void edit(T00404testXUsuario t00404testXUsuario);

    void remove(T00404testXUsuario t00404testXUsuario);

    T00404testXUsuario find(Object id);

    List<T00404testXUsuario> findAll();

    List<T00404testXUsuario> findRange(int[] range);

    int count();

}
