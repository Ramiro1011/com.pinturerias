package com.pinturerias.com.pinturerias.compartidos.builder.sucursal;

import com.pinturerias.com.pinturerias.compartidos.builder.base.ProductoBuilderBase;
import com.pinturerias.com.pinturerias.compartidos.entity.*;
import com.pinturerias.com.pinturerias.compartidos.entity.sucursal.ProductoOtroSucursal;
import com.pinturerias.com.pinturerias.sucursal.entity.CategoriaSucursal;
import com.pinturerias.com.pinturerias.sucursal.entity.FamiliaSucursal;
import org.springframework.stereotype.Component;

@Component
public class ProductoOtroSucursalBuilder implements ProductoBuilderBase {

    private ProductoOtroSucursal producto;

    @Override
    public String tipo() {
        return "OTRO_SUCURSAL";
    }

    public ProductoOtroSucursalBuilder() {
        reset();
    }

    @Override
    public void reset() {
        producto = new ProductoOtroSucursal();
    }

    @Override
    public void setNombre(String nombre) {
        producto.setNombre(nombre);
    }

    @Override
    public void setDescripcion(String descripcion) {
        producto.setDescripcion(descripcion);
    }

    @Override
    public void setMarca(String marca) {
        producto.setMarca(marca);
    }

    @Override
    public void setPrecioFinal(int precioFinal) {
        producto.setPrecioFinal(precioFinal);
    }

    @Override
    public void setCategoria(Categoria categoria) {
        producto.setCategoria((CategoriaSucursal) categoria);
    }

    @Override
    public void setFamilia(Familia familia) {
        producto.setFamilia((FamiliaSucursal) familia);
    }

    @Override
    public void setTamanoEnvase(TamanoEnvase tamanoEnvase) {

    }


    @Override
    public void setTipoPintura(TipoPintura tipoPintura) {

    }

    @Override
    public void setColor(ColorBase color) {

    }

    @Override
    public void setStock(int stock) {
        producto.setStock(stock);
    }


    @Override
    public ProductoOtroSucursal build() {
        return producto;
    }
}
