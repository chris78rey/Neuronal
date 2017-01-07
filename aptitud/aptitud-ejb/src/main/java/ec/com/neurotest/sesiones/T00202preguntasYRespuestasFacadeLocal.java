/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00202preguntasYRespuestas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface T00202preguntasYRespuestasFacadeLocal {

    void create(T00202preguntasYRespuestas t00202preguntasYRespuestas);

    void edit(T00202preguntasYRespuestas t00202preguntasYRespuestas);

    void remove(T00202preguntasYRespuestas t00202preguntasYRespuestas);

    T00202preguntasYRespuestas find(Object id);

    List<T00202preguntasYRespuestas> findAll();

    List<T00202preguntasYRespuestas> findRange(int[] range);

    int count();

}
