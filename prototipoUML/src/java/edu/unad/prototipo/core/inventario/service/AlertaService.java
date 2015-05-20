/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unad.prototipo.core.inventario.service;

import edu.unad.prototipo.core.inventario.manager.AlertaManager;
import edu.unad.prototipo.modelo.inventario.Alerta;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class AlertaService {
    
    @EJB
    private AlertaManager manager;

    public AlertaService() {
    }

    public int count() {
        return manager.countAlerta();
    }

    public List<Alerta> findRange(int[] i) {
        return manager.findRange(i);
    }

    public void create(Alerta current) {
        manager.create(current);
    }

    public void edit(Alerta current) {
        manager.edit(current);
    }

    public void remove(Alerta current) {
        manager.remove(current); 
    }

    public List<?> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Alerta find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
