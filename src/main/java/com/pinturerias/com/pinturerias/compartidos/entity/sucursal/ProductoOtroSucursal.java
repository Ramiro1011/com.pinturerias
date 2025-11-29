package com.pinturerias.com.pinturerias.compartidos.entity.sucursal;

import com.pinturerias.com.pinturerias.compartidos.entity.Producto;
import com.pinturerias.com.pinturerias.sucursal.entity.CategoriaSucursal;
import com.pinturerias.com.pinturerias.sucursal.entity.FamiliaSucursal;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "producto_otro_sucursal")
@Data
public class ProductoOtroSucursal extends Producto {
    private int stock;
    @ManyToOne
    private FamiliaSucursal familia;
    @ManyToOne
    private CategoriaSucursal categoria;

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock(){return stock;}
    public void setFamilia(FamiliaSucursal familia) {this.familia = familia;}
    public void setCategoria(CategoriaSucursal categoria) {
        this.categoria = categoria;
    }
}