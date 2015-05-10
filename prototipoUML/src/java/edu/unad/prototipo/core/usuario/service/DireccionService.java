package edu.unad.prototipo.core.usuario.service;

import edu.unad.prototipo.core.usuario.manager.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class DireccionService {
    
    @EJB
    private DireccionManager manager;

    public DireccionService() {
    }
    
}
