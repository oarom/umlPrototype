package edu.unad.prototipo.core.inventario.dao;

import edu.unad.prototipo.core.dao.AbstractDAO;
import edu.unad.prototipo.modelo.inventario.Proveedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ProveedorDAO extends AbstractDAO<Proveedor> {
    @PersistenceContext(unitName = "prototipoUMLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProveedorDAO() {
        super(Proveedor.class);
    }
    
}
