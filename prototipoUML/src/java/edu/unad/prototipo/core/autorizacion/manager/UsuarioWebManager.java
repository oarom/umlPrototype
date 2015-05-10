package edu.unad.prototipo.core.autorizacion.manager;

import edu.unad.prototipo.core.autorizacion.dao.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class UsuarioWebManager {
    
    @EJB
    private UsuarioWebDAO dao;

    public UsuarioWebManager() {
    }
    
}
