package edu.unad.prototipo.core.autorizacion.service;

import edu.unad.prototipo.core.autorizacion.manager.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class UsuarioWebService {
    
    @EJB
    private UsuarioWebManager manager;

    public UsuarioWebService() {
    }
    
}
