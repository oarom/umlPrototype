/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unad.prototipo.core.distribucion.manager;

import edu.unad.prototipo.core.distribucion.dao.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class OrdenEntregaManager {
    
    @EJB
    private OrdenEntregaDAO dao;

    public OrdenEntregaManager() {
    }
    
}
