package com.pinturerias.com.pinturerias.compartidos.entity;


import com.pinturerias.com.pinturerias.general.entity.BasePinturaGeneral;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class TipoPintura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected BasePinturaGeneral base;
    protected Double precioPintura;
    protected Double RendimientoMT2;
}
