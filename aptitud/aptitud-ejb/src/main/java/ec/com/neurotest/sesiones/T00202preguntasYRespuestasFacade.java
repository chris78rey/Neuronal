/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00202preguntasYRespuestas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crrb
 */
@Stateless
public class T00202preguntasYRespuestasFacade extends AbstractFacade<T00202preguntasYRespuestas> implements T00202preguntasYRespuestasFacadeLocal {

    @PersistenceContext(unitName = "Punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T00202preguntasYRespuestasFacade() {
        super(T00202preguntasYRespuestas.class);
    }

}
