/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00404amatriculagrupador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crrb
 */
@Stateless
public class T00404amatriculagrupadorFacade extends AbstractFacade<T00404amatriculagrupador> implements T00404amatriculagrupadorFacadeLocal {

    @PersistenceContext(unitName = "Punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T00404amatriculagrupadorFacade() {
        super(T00404amatriculagrupador.class);
    }

}
