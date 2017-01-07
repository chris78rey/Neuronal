/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00404amatriculagrupador;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00404amatriculagrupadorFacadeLocal {

    void create(T00404amatriculagrupador t00404amatriculagrupador);

    void edit(T00404amatriculagrupador t00404amatriculagrupador);

    void remove(T00404amatriculagrupador t00404amatriculagrupador);

    T00404amatriculagrupador find(Object id);

    List<T00404amatriculagrupador> findAll();

    List<T00404amatriculagrupador> findRange(int[] range);

    int count();

}
