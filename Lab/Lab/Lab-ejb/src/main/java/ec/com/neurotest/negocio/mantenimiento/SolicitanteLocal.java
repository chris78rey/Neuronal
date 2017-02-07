/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.solicitante.V00003personasolicitante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface SolicitanteLocal {

    int count();

    void create(V00003personasolicitante entity);

    void edit(V00003personasolicitante entity);

    V00003personasolicitante find(Object id);

    List<V00003personasolicitante> findAll();

    List<V00003personasolicitante> findRange(int[] range);

    void remove(V00003personasolicitante entity);


}
