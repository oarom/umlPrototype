/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unad.prototipo.core.inventario.dao;

import edu.unad.prototipo.core.dao.AbstractDAO;
import edu.unad.prototipo.modelo.inventario.ItemOrdenCompra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class ItemOrdenCompraDAO extends AbstractDAO<ItemOrdenCompra> {
    @PersistenceContext(unitName = "prototipoUMLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemOrdenCompraDAO() {
        super(ItemOrdenCompra.class);
    }
    
}