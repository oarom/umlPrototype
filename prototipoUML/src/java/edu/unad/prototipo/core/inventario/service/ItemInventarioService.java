/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unad.prototipo.core.inventario.service;

import edu.unad.prototipo.core.facturacion.manager.FacturaManager;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ItemInventarioService {
    
    @EJB
    private FacturaManager manager;

    public ItemInventarioService() {
    }
    
}
