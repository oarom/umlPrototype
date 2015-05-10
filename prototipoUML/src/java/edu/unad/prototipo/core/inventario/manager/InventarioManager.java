package edu.unad.prototipo.core.inventario.manager;

import edu.unad.prototipo.core.inventario.dao.InventarioDAO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class InventarioManager {
    
    @EJB
    private InventarioDAO dao;

    public InventarioManager() {
    }
    
}
