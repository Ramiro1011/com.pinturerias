package com.pinturerias.com.pinturerias.compartidos.entity.sucursal;

import com.pinturerias.com.pinturerias.compartidos.entity.Producto;
import com.pinturerias.com.pinturerias.sucursal.entity.*;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "producto_pintura_sucursal")
@Data
public class ProductoPinturaSucursal extends Producto {
    private int stock;
    @ManyToOne
    private FamiliaSucursal familia;
    @ManyToOne
    private CategoriaSucursal categoria;
    @ManyToOne
    private TipoPinturaSucursal tipoPintura;
    @ManyToOne
    private ColorSucursal color;
    @ManyToOne
    private TamanoEnvaseSucursal tamEnv;

    public void setTipoPintura(TipoPinturaSucursal tipo) {
        this.tipoPintura = tipo;
    }
    public void setColor(ColorSucursal color) {
        this.color = color;
    }
    public void setTamEnv(TamanoEnvaseSucursal tamEnv){
        this.tamEnv = tamEnv;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setFamilia(FamiliaSucursal familia) {this.familia = familia;}
    public void setCategoria(CategoriaSucursal categoria) {
        this.categoria = categoria;
    }
    public int getStock(){return stock;}
}
