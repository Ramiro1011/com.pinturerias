package com.pinturerias.com.pinturerias.compartidos.entity.general;

import com.pinturerias.com.pinturerias.compartidos.entity.Producto;
import com.pinturerias.com.pinturerias.general.entity.CategoriaGeneral;
import com.pinturerias.com.pinturerias.general.entity.FamiliaGeneral;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "producto_otro")
@Data
public class ProductoOtroGeneral extends Producto {
    private FamiliaGeneral familia;
    private CategoriaGeneral categoria;

    public void setFamilia(FamiliaGeneral familia) {this.familia = familia;}
    public void setCategoria(CategoriaGeneral categoria) {
        this.categoria = categoria;
    }
}
