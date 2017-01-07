/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00201agrupador;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00201agrupadorFacadeLocal {

    void create(T00201agrupador t00201agrupador);

    void edit(T00201agrupador t00201agrupador);

    void remove(T00201agrupador t00201agrupador);

    T00201agrupador find(Object id);

    List<T00201agrupador> findAll();

    List<T00201agrupador> findRange(int[] range);

    int count();

}
