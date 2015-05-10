package edu.unad.prototipo.core.facturacion.manager;

import edu.unad.prototipo.core.facturacion.dao.ItemFacturaDAO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ItemFacturaManager{
    
    @EJB
    private ItemFacturaDAO dao;

    public ItemFacturaManager() {
    }
    
}
