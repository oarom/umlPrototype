package edu.unad.prototipo.core.autorizacion.manager;

import edu.unad.prototipo.core.autorizacion.dao.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class RolManager {
    
    @EJB
    private RolDAO dao;

    public RolManager() {

    }
    
}
