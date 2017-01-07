/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.sesiones;

import ec.com.neurotest.entidades.T00404testXUsuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crrb
 */
@Stateless
public class T00404testXUsuarioFacade extends AbstractFacade<T00404testXUsuario> implements T00404testXUsuarioFacadeLocal {

    @PersistenceContext(unitName = "Punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T00404testXUsuarioFacade() {
        super(T00404testXUsuario.class);
    }

}
