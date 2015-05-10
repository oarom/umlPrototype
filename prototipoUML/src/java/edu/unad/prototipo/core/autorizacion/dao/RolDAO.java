package edu.unad.prototipo.core.autorizacion.dao;

import edu.unad.prototipo.core.dao.AbstractDAO;
import edu.unad.prototipo.modelo.autorizacion.Rol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class RolDAO extends AbstractDAO<Rol> {
    @PersistenceContext(unitName = "prototipoUMLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolDAO() {
        super(Rol.class);
    }
    
}
