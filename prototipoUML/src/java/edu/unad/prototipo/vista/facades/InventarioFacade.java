package edu.unad.prototipo.vista.facades;

import edu.unad.prototipo.core.inventario.service.AlertaService;
import edu.unad.prototipo.core.inventario.service.InventarioService;
import edu.unad.prototipo.core.inventario.service.ItemInventarioService;
import edu.unad.prototipo.core.inventario.service.ItemOrdenCompraService;
import edu.unad.prototipo.core.inventario.service.OrdenCompraService;
import edu.unad.prototipo.core.inventario.service.ProductoService;
import edu.unad.prototipo.core.inventario.service.ProveedorService;
import edu.unad.prototipo.modelo.inventario.Alerta;
import edu.unad.prototipo.modelo.inventario.Inventario;
import edu.unad.prototipo.modelo.inventario.ItemInventario;
import edu.unad.prototipo.modelo.inventario.ItemOrdenCompra;
import edu.unad.prototipo.modelo.inventario.OrdenCompra;
import edu.unad.prototipo.modelo.inventario.Producto;
import edu.unad.prototipo.modelo.inventario.Proveedor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class InventarioFacade {
    
    @EJB
    private AlertaService alertaService;
    
    @EJB
    private InventarioService inventarioService;
    
    @EJB
    private ItemInventarioService itemInventarioService;
    
    @EJB
    private ItemOrdenCompraService itemOrdenCompraService;
    
    @EJB
    private OrdenCompraService ordenCompraService;
    
    @EJB
    private ProductoService productoService;
    
    @EJB
    private ProveedorService proveedorService;

    public int countAlerta() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Alerta> findAlertaRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createAlerta(Alerta current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editAlerta(Alerta current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeAlerta(Alerta current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllAlerta() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Alerta findAlerta(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countInventario() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Inventario> findInventarioRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createInventario(Inventario current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editInventario(Inventario current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeInventario(Inventario current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllInventario() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Inventario findInventario(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countItemInventario() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<ItemInventario> findItemInventarioRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createItemInventario(ItemInventario current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editItemInventario(ItemInventario current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeItemInventario(ItemInventario current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllItemInventario() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ItemInventario findItemInventario(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countItemOrdenCompra() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<ItemOrdenCompra> findItemOrdenCompraRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createItemOrdenCompra(ItemOrdenCompra current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editItemOrdenCompra(ItemOrdenCompra current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeItemOrdenCompra(ItemOrdenCompra current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllItemOrdenCompra() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ItemOrdenCompra findItemOrdenCompra(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countOrdenCompra() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<OrdenCompra> findOrdenCompraRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createOrdenCompra(OrdenCompra current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editOrdenCompra(OrdenCompra current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeOrdenCompra(OrdenCompra current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllOrdenCompra() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public OrdenCompra findOrdenCompra(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countProducto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Producto> findProductoRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createProducto(Producto current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editProducto(Producto current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeProducto(Producto current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllProducto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Producto findProducto(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Proveedor> findProveedorRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createProveedor(Proveedor current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editProveedor(Proveedor current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeProveedor(Proveedor current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Proveedor findProveedor(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


}
