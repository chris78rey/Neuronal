/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00201agrupador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crrb
 */
@Stateless
public class T00201agrupadorFacade extends AbstractFacade<T00201agrupador> implements T00201agrupadorFacadeLocal {

    @PersistenceContext(unitName = "Punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T00201agrupadorFacade() {
        super(T00201agrupador.class);
    }

}
