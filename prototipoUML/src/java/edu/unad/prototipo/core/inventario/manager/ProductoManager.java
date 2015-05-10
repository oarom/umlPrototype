package edu.unad.prototipo.core.inventario.manager;

import edu.unad.prototipo.core.inventario.dao.ProductoDAO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ProductoManager {
    
    @EJB
    private ProductoDAO dao;

    public ProductoManager() {
    }
    
}
