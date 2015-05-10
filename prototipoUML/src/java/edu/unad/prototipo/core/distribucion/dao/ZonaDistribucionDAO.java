package edu.unad.prototipo.core.distribucion.dao;

import edu.unad.prototipo.core.dao.AbstractDAO;
import edu.unad.prototipo.modelo.distribucion.ZonaDistribucion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ZonaDistribucionDAO extends AbstractDAO<ZonaDistribucion> {
    @PersistenceContext(unitName = "prototipoUMLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZonaDistribucionDAO() {
        super(ZonaDistribucion.class);
    }
    
}
