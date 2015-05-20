package edu.unad.prototipo.core.usuario.service;

import edu.unad.prototipo.core.usuario.manager.*;
import edu.unad.prototipo.modelo.usuarios.Direccion;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class DireccionService {
    
    @EJB
    private DireccionManager manager;

    public DireccionService() {
    }

    public void create(Direccion current) {
        manager.create(current);
    }

    public Direccion find(Long id) {
        return manager.find(id);
    }

    public List<?> findAll() {
        return manager.findAll();
    }

    public void remove(Direccion current) {
        manager.remove(current);
    }

    public void edit(Direccion current) {
        manager.edit(current);
    }

    public List<Direccion> findRange(int[] i) {
        return manager.findRante(i);
    }

    public int count() {
        return manager.count();
    }
    
}
