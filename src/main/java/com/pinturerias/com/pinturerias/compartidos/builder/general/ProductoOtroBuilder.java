package com.pinturerias.com.pinturerias.compartidos.builder.general;

import com.pinturerias.com.pinturerias.compartidos.builder.base.ProductoBuilderBase;
import com.pinturerias.com.pinturerias.compartidos.entity.*;
import com.pinturerias.com.pinturerias.general.entity.CategoriaGeneral;
import com.pinturerias.com.pinturerias.general.entity.FamiliaGeneral;
import com.pinturerias.com.pinturerias.compartidos.entity.general.ProductoOtroGeneral;
import org.springframework.stereotype.Component;

@Component
public class ProductoOtroBuilder implements ProductoBuilderBase {
    private ProductoOtroGeneral producto;

    public ProductoOtroBuilder() {
        reset();
    }

    @Override
    public String tipo() {
        return "OTRO_GENERAL";
    }

    @Override
    public void reset() {
        producto = new ProductoOtroGeneral();
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
        // lógica real
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

    }


    @Override
    public void setTipoPintura(TipoPintura tipoPintura) {

    }

    @Override
    public void setColor(ColorBase color) {

    }

    @Override
    public ProductoOtroGeneral build() {
        return producto;
    }
}
