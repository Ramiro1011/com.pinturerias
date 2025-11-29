package com.pinturerias.com.pinturerias.compartidos.dto;

import com.pinturerias.com.pinturerias.compartidos.enumerate.ContextoProducto;
import com.pinturerias.com.pinturerias.compartidos.enumerate.Tipo;

public class ProductoDTO {
    private String nombre;
    private String descripcion;
    private int precioFinal;
    private String marca;

    private Long tipoPinturaId;
    private Long colorId;
    private Long basePinturaId;
    private Long familiaId;
    private Long categoriaId;
    private Long tamanoEnvId;
    private Tipo tipo;

    private ContextoProducto contexto;
    private int stock;

    public ProductoDTO() {
    }

    public ProductoDTO( String nombre, String descripcion, int precioFinal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioFinal = precioFinal;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Long getTipoPinturaId() {
        return tipoPinturaId;
    }

    public void setTipoPintura(Long tipoPintura) {
        this.tipoPinturaId = tipoPintura;
    }

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long color) {
        this.colorId = color;
    }

    public Long getCategoriaId() {return categoriaId;}

    public Long getFamiliaId() { return familiaId;}

    public Long getBasePinturaId() { return basePinturaId;}

    public Long getTamanoEnvId() { return tamanoEnvId;}

    public int getStock() {
        return stock;
    }

    public ContextoProducto getContexto() {
        return contexto;
    }

    public void setContexto(ContextoProducto contexto) {
        this.contexto = contexto;
    }
}
