/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00401inscrmatricula;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crrb
 */
@Stateless
public class T00401inscrmatriculaFacade extends AbstractFacade<T00401inscrmatricula> implements T00401inscrmatriculaFacadeLocal {

    @PersistenceContext(unitName = "Punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T00401inscrmatriculaFacade() {
        super(T00401inscrmatricula.class);
    }

}
