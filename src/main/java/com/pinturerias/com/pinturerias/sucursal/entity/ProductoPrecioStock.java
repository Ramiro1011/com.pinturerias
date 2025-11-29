package com.pinturerias.com.pinturerias.sucursal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Producto_precio_stock")
@Data
public class ProductoPrecioStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productoId;
    private int stock;
}
