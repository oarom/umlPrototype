package edu.unad.prototipo.vista.facades;

import edu.unad.prototipo.core.autorizacion.service.PermisoService;
import edu.unad.prototipo.core.autorizacion.service.RolService;
import edu.unad.prototipo.core.autorizacion.service.UsuarioWebService;
import edu.unad.prototipo.modelo.autorizacion.Permiso;
import edu.unad.prototipo.modelo.autorizacion.Rol;
import edu.unad.prototipo.modelo.autorizacion.UsuarioWeb;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class AutorizacionFacade {
    
    @EJB
    private PermisoService permisoService;

    @EJB
    private RolService rolService;
    
    @EJB
    private UsuarioWebService usuarioWebService;
        
    public Permiso findPermiso(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllPermisos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countPermisos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removePermiso(Permiso current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editPermiso(Permiso current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createPermiso(Permiso current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Permiso> findPermisoRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countRoles() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Rol> findRolRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createRol(Rol current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editRol(Rol current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeRol(Rol current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllRoles() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Rol findRol(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int countUsuariosWeb() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<UsuarioWeb> findUsuariosWebRange(int[] i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void createUsuariosWeb(UsuarioWeb current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void editUsuariosWeb(UsuarioWeb current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void removeUsuariosWeb(UsuarioWeb current) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<?> findAllUsuariosWeb() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public UsuarioWeb findUsuariosWeb(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
