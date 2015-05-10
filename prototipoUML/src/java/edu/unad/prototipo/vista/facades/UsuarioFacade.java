package edu.unad.prototipo.vista.facades;

import edu.unad.prototipo.core.usuario.service.DireccionService;
import edu.unad.prototipo.core.usuario.service.PersonaService;
import edu.unad.prototipo.modelo.usuarios.Direccion;
import edu.unad.prototipo.modelo.usuarios.Persona;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class UsuarioFacade {

    @EJB
    private PersonaService personaService;
    
    @EJB DireccionService direccionService;

    public int countDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Direccion> findDireccionRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editDireccion(Direccion current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeDireccion(Direccion current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Direccion findDireccion(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createDireccion(Direccion current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countPersona() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Persona> findPersonaRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createPersona(Persona current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editPersona(Persona current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removePersona(Persona current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllPersona() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Persona findPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
