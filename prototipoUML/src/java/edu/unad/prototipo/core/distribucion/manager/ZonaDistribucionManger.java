package edu.unad.prototipo.core.distribucion.manager;

import edu.unad.prototipo.core.distribucion.dao.ZonaDistribucionDAO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ZonaDistribucionManger {
    
    @EJB
    private ZonaDistribucionDAO dao;

    public ZonaDistribucionManger() {
    
    }
    
}
