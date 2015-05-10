package edu.unad.prototipo.vista.facades;

import edu.unad.prototipo.core.distribucion.service.OrdenEntregaService;
import edu.unad.prototipo.core.distribucion.service.ZonaDistribucionService;
import edu.unad.prototipo.modelo.distribucion.OrdenEntrega;
import edu.unad.prototipo.modelo.distribucion.ZonaDistribucion;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class DistribucionFacade {
    
    @EJB
    private OrdenEntregaService ordenEntregaService;

    @EJB
    private ZonaDistribucionService zonaDistribucionService;

    public int countOrdenesEntrega() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<OrdenEntrega> findOrdenesEntregaRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createOrdenesEntrega(OrdenEntrega current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editOrdenesEntrega(OrdenEntrega current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeOrdenesEntrega(OrdenEntrega current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllOrdenesEntrega() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public OrdenEntrega findOrdeneEntrega(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countZonaDistribucion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<ZonaDistribucion> findZonaDistribucionRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createZonaDistribucion(ZonaDistribucion current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editZonaDistribucion(ZonaDistribucion current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeZonaDistribucion(ZonaDistribucion current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllZonaDistribucion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ZonaDistribucion findZonaDistribucion(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
