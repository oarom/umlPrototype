package edu.unad.prototipo.core.autorizacion.dao;

import edu.unad.prototipo.core.dao.AbstractDAO;
import edu.unad.prototipo.modelo.autorizacion.UsuarioWeb;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class UsuarioWebDAO extends AbstractDAO<UsuarioWeb> {
    @PersistenceContext(unitName = "prototipoUMLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioWebDAO() {
        super(UsuarioWeb.class);
    }
    
}
