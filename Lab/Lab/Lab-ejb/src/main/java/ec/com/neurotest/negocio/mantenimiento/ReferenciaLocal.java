/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.medicorefiere.V00001medicorefiere;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface ReferenciaLocal {

    public void create(V00001medicorefiere entity);

}
