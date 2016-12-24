/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apto.mavenproject6.sess;

import com.apto.mavenproject6.T002ClasificadorTest;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crrb
 */
@Stateless
public class T002ClasificadorTestFacade extends AbstractFacade<T002ClasificadorTest> {

    @PersistenceContext(unitName = "com.apto_mavenproject6_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T002ClasificadorTestFacade() {
        super(T002ClasificadorTest.class);
    }
    
}
