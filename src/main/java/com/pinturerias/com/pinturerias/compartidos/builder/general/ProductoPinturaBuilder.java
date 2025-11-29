package com.pinturerias.com.pinturerias.compartidos.builder.general;

import com.pinturerias.com.pinturerias.compartidos.builder.base.ProductoBuilderBase;
import com.pinturerias.com.pinturerias.compartidos.entity.*;
import com.pinturerias.com.pinturerias.compartidos.entity.general.ProductoPinturaGeneral;
import com.pinturerias.com.pinturerias.general.entity.*;
import org.springframework.stereotype.Component;

@Component
public class ProductoPinturaBuilder implements ProductoBuilderBase {
    private ProductoPinturaGeneral producto;

    @Override
    public String tipo() {
        return "PINTURA_GENERAL";
    }

    public ProductoPinturaBuilder() {
        reset();
    }

    @Override
    public void reset() {
        producto = new ProductoPinturaGeneral();
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
        // ejemplo: pinturas tienen recargo 10%
        int precioFinal = (int) (precioBase * 1.10);
        producto.setPrecioFinal(precioFinal);
    }

    @Override
    public void setCategoria(Categoria categoria) {
        producto.setCategoria((CategoriaGeneral) categoria);
    }

    @Override
    public void setFamilia(Familia familia) {
        producto.setFamilia((FamiliaGeneral) familia);
    }

    @Override
    public void setTamanoEnvase(TamanoEnvase tamanoEnvase) {
        producto.setTamEnv((TamanoEnvaseGeneral) tamanoEnvase);
    }


    @Override
    public void setTipoPintura(TipoPintura tipoPintura) {
        producto.setTipoPintura((TipoPinturaGeneral) tipoPintura);
    }

    @Override
    public void setColor(ColorBase color) {
        producto.setColor((ColorGeneral) color);
    }

    @Override
    public ProductoPinturaGeneral build() {
        return producto;
    }
}
