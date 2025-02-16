package com.banco.sucursal.persistencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Producto {
    @Id
    @Column
    private String idProducto;
    @Column
    private String idCliente;
    @Column
    private int tipoProducto;
    @Column
    private float saldoProducto;
}
