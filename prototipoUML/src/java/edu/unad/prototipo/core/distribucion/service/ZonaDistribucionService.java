package edu.unad.prototipo.core.distribucion.service;

import edu.unad.prototipo.core.distribucion.dao.ZonaDistribucionDAO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ZonaDistribucionService {
    
    @EJB
    private ZonaDistribucionDAO dao;

    public ZonaDistribucionService() {
    
    }
    
}
