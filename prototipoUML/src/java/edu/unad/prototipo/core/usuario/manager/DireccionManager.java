package edu.unad.prototipo.core.usuario.manager;

import edu.unad.prototipo.core.usuario.dao.*;
import edu.unad.prototipo.modelo.usuarios.Direccion;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class DireccionManager {
    
    @EJB
    private DireccionDAO dao;

    public DireccionManager() {
    }

    public void create(Direccion current) {
        dao.create(current);
    }

    public Direccion find(Long id) {
        return dao.find(id);
    }

    public List<?> findAll() {
        return dao.findAll();
    }

    public void remove(Direccion current) {
        dao.remove(current);
    }

    public void edit(Direccion current) {
        dao.edit(current);
    }

    public List<Direccion> findRante(int[] i) {
        return dao.findRange(i);
    }

    public int count() {
        return dao.count();
    }
    
}
