/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apto.mavenproject6.sess;

import com.apto.mavenproject6.T00101usuarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crrb
 */
@Stateless
public class T00101usuariosFacade extends AbstractFacade<T00101usuarios> {

    @PersistenceContext(unitName = "com.apto_mavenproject6_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T00101usuariosFacade() {
        super(T00101usuarios.class);
    }
    
}
