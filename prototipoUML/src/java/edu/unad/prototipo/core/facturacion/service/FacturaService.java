package edu.unad.prototipo.core.facturacion.service;

import edu.unad.prototipo.core.facturacion.manager.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class FacturaService {
    
    @EJB
    private FacturaManager manager;

    public FacturaService() {
    }
    
}
