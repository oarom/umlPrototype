package edu.unad.prototipo.core.inventario.service;

import edu.unad.prototipo.core.facturacion.manager.FacturaManager;
import edu.unad.prototipo.core.inventario.manager.ProveedorManager;
import edu.unad.prototipo.modelo.inventario.Proveedor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ProveedorService {

    @EJB
    private ProveedorManager manager;

    public ProveedorService() {
    }

    public Proveedor find(Long id) {
        return manager.find(id);
    }

    public List<?> findAll() {
        return manager.findAll();
    }

    public void remove(Proveedor current) {
        manager.remove(current);
    }

    public void edit(Proveedor current) {
        manager.edit(current);
    }

    public void create(Proveedor current) {
        manager.create(current);
    }

    public List<Proveedor> findRange(int[] i) {
        return manager.findRange(i);
    }

    public int count() {
        return manager.count();
    }
}
