/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.negocio.mantenimiento;

import ec.com.neurotest.entidades.items.Items;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crrb
 */
@Local
public interface ReglasNegocioLocal {


    public List<Items> getListaItemsLaboratorio();

    public List<Items> getListaGruposExamenesImagenes();

    public void create(Items entity);

    public void edit(Items entity);

    public void remove(Items entity);

    public int count();

    public Items find(Object id);

}
