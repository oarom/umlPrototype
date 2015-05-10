package edu.unad.prototipo.core.usuario.service;

import edu.unad.prototipo.core.usuario.manager.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class PersonaService  {
    
    @EJB
    private PersonaManager manager;

    public PersonaService() {
    }
    
}
