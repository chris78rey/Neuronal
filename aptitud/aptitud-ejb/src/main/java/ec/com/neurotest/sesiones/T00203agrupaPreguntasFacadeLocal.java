/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00203agrupaPreguntas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00203agrupaPreguntasFacadeLocal {

    void create(T00203agrupaPreguntas t00203agrupaPreguntas);

    void edit(T00203agrupaPreguntas t00203agrupaPreguntas);

    void remove(T00203agrupaPreguntas t00203agrupaPreguntas);

    T00203agrupaPreguntas find(Object id);

    List<T00203agrupaPreguntas> findAll();

    List<T00203agrupaPreguntas> findRange(int[] range);

    int count();

}
