package com.pinturerias.com.pinturerias.compartidos.entity;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class TipoPintura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected Double precioPintura;
    protected Double RendimientoMT2;
}
