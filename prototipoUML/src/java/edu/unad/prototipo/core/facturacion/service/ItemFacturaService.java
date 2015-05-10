package edu.unad.prototipo.core.facturacion.service;

import edu.unad.prototipo.core.facturacion.manager.ItemFacturaManager;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ItemFacturaService{
    
    @EJB
    private ItemFacturaManager manager;

    public ItemFacturaService() {
    }
    
}
