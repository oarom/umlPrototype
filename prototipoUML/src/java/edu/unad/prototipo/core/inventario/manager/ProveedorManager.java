package edu.unad.prototipo.core.inventario.manager;

import edu.unad.prototipo.core.inventario.dao.ProveedorDAO;
import edu.unad.prototipo.modelo.inventario.Proveedor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ProveedorManager {

    @EJB
    private ProveedorDAO dao;

    public ProveedorManager() {
    }

    public List<Proveedor> findRange(int[] i) {
        return dao.findRange(i);
    }

    public void create(Proveedor current) {
        dao.create(current);
    }

    public void edit(Proveedor current) {
        dao.edit(current);
    }

    public void remove(Proveedor current) {
        dao.remove(current);
    }

    public List<?> findAll() {
        return dao.findAll();
    }

    public Proveedor find(Long id) {
        return dao.find(id);
    }

    public int count() {
        return dao.count();
    }

}
