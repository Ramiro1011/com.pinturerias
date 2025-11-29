package com.pinturerias.com.pinturerias.compartidos.builder.base;

import com.pinturerias.com.pinturerias.compartidos.entity.*;

public interface ProductoBuilderBase {
    String tipo();
    void reset();

    void setNombre(String nombre);
    void setDescripcion(String descripcion);
    void setMarca(String marca);
    void setPrecioFinal(int precioFinal);

    void setCategoria(Categoria categoria);
    void setFamilia(Familia familia);
    void setTamanoEnvase(TamanoEnvase tamanoEnvase);
    void setTipoPintura(TipoPintura tipoPintura);
    void setColor(ColorBase color);

    default void setStock(int stock) {}

    Producto build();
}
