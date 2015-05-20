/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unad.prototipo.core.inventario.manager;

import edu.unad.prototipo.core.inventario.dao.AlertaDAO;
import edu.unad.prototipo.modelo.inventario.Alerta;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class AlertaManager {
    
    @EJB
    private AlertaDAO dao;

    public AlertaManager() {
    }

    public int countAlerta() {
        return dao.count();
    }

    public List<Alerta> findRange(int[] i) {
        return dao.findRange(i);
    }

    public void create(Alerta current) {
        dao.create(current);
    }

    public void edit(Alerta current) {
        dao.edit(current);
    }

    public void remove(Alerta current) {
       dao.remove(current);
    }
    
}
