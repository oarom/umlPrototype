package edu.unad.prototipo.core.inventario.service;

import edu.unad.prototipo.core.facturacion.manager.FacturaManager;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ProductoService {
    
    @EJB
    private FacturaManager manager;

    public ProductoService() {
    }
    
}
