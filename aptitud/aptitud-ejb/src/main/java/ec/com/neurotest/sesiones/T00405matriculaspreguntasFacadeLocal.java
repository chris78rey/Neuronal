/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00405matriculaspreguntas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00405matriculaspreguntasFacadeLocal {

    void create(T00405matriculaspreguntas t00405matriculaspreguntas);

    void edit(T00405matriculaspreguntas t00405matriculaspreguntas);

    void remove(T00405matriculaspreguntas t00405matriculaspreguntas);

    T00405matriculaspreguntas find(Object id);

    List<T00405matriculaspreguntas> findAll();

    List<T00405matriculaspreguntas> findRange(int[] range);

    int count();

}
