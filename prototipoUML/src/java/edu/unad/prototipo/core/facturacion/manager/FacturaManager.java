package edu.unad.prototipo.core.facturacion.manager;

import edu.unad.prototipo.core.facturacion.dao.*;
import edu.unad.prototipo.modelo.inventario.Proveedor;
import java.util.List;
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

    public int count() {
        return dao.count();
    }
    
}
