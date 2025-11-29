package com.pinturerias.com.pinturerias.compartidos.builder.sucursal;

import com.pinturerias.com.pinturerias.compartidos.builder.base.ProductoBuilderBase;
import com.pinturerias.com.pinturerias.compartidos.entity.*;
import com.pinturerias.com.pinturerias.compartidos.entity.sucursal.ProductoPinturaSucursal;
import com.pinturerias.com.pinturerias.sucursal.entity.*;
import org.springframework.stereotype.Component;

@Component
public class ProductoPinturaSucursalBuilder implements ProductoBuilderBase {
    private ProductoPinturaSucursal producto;

    @Override
    public String tipo() {
        return "PINTURA_SUCURSAL";
    }

    public ProductoPinturaSucursalBuilder() {
        reset();
    }

    @Override
    public void reset() {
        producto = new ProductoPinturaSucursal();
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
    public void setPrecioFinal(int precioBase) {
        // ejemplo: pintura sucursal = recargo 10% + manejo sucursal 5%
        int precioFinal = (int) (precioBase * 1.15);
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
        producto.setTamEnv((TamanoEnvaseSucursal) tamanoEnvase);
    }

    @Override
    public void setBasePintura(BasePintura basePintura) {
        producto.setBasePinturaSucursal((BasePinturaSucursal) basePintura);
    }

    @Override
    public void setTipoPintura(TipoPintura tipoPintura) {
        producto.setTipoPintura((TipoPinturaSucursal) tipoPintura);
    }

    @Override
    public void setColor(ColorBase color) {
        producto.setColor((ColorSucursal) color);
    }

    @Override
    public void setStock(int stock) {
        producto.setStock(stock);
    }

    @Override
    public ProductoPinturaSucursal build() {
        return producto;
    }
}
