package edu.unad.prototipo.modelo.facturacion;

import javax.persistence.Entity;

/**
 *
 * @author oscar.romero
 */
@Entity
public enum MedioPago {
    EFECTIVO,
    TARJETA,
    BONOS
}
