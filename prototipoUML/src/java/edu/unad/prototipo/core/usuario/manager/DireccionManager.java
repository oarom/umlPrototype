package edu.unad.prototipo.core.usuario.manager;

import edu.unad.prototipo.core.usuario.dao.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class DireccionManager {
    
    @EJB
    private DireccionDAO dao;

    public DireccionManager() {
    }
    
}
