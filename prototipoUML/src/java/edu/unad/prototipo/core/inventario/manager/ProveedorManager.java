package edu.unad.prototipo.core.inventario.manager;

import edu.unad.prototipo.core.inventario.dao.ProveedorDAO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ProveedorManager {
    
    @EJB
    private ProveedorDAO dao;

    public ProveedorManager() {
    }
    
}
