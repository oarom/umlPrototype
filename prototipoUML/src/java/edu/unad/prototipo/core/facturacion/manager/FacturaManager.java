package edu.unad.prototipo.core.facturacion.manager;

import edu.unad.prototipo.core.facturacion.dao.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class FacturaManager {
    
    @EJB
    private FacturaDAO dao;

    public FacturaManager() {
    }
    
}
