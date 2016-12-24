/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managed;

import com.apto.mavenproject6.T00101usuarios;
import com.apto.mavenproject6.sess.T00101usuariosFacade;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author crrb
 */
@Named(value="newJSFManagedBean")
@Dependent
public class NewJSFManagedBean implements Serializable {

    public List<T00101usuarios> getDdsssfindAll() {
        return t00101usuariosFacade.findAll();
    }

    @EJB
    private T00101usuariosFacade t00101usuariosFacade;

    /** Creates a new instance of NewJSFManagedBean */
    public NewJSFManagedBean() {
    }

}
