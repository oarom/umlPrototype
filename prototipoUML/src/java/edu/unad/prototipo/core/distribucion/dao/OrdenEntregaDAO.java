/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unad.prototipo.core.distribucion.dao;

import edu.unad.prototipo.core.dao.AbstractDAO;
import edu.unad.prototipo.modelo.distribucion.OrdenEntrega;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oscar.romero
 */
@Stateless
public class OrdenEntregaDAO extends AbstractDAO<OrdenEntrega> {
    @PersistenceContext(unitName = "prototipoUMLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenEntregaDAO() {
        super(OrdenEntrega.class);
    }
    
}
