package com.pinturerias.com.pinturerias.compartidos.entity.general;

import com.pinturerias.com.pinturerias.general.entity.*;
import com.pinturerias.com.pinturerias.compartidos.entity.Producto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "producto_pintura")
@Data
public class ProductoPinturaGeneral extends Producto {
    private FamiliaGeneral familia;
    private CategoriaGeneral categoria;
    private TipoPinturaGeneral tipoPinturaGeneral;
    private ColorGeneral colorGeneral;
    private TamanoEnvaseGeneral tamEnv;
    private BasePinturaGeneral base;

    public void setTipoPintura(TipoPinturaGeneral tipo) {
        this.tipoPinturaGeneral = tipo;
    }
    public void setColor(ColorGeneral colorGeneral) {
        this.colorGeneral = colorGeneral;
    }
    public void setTamEnv(TamanoEnvaseGeneral tamenv){
        this.tamEnv = tamenv;
    }
    public void setFamilia(FamiliaGeneral familia) {this.familia = familia;}
    public void setCategoria(CategoriaGeneral categoria) {
        this.categoria = categoria;
    }
    public void setBase(BasePinturaGeneral base) {this.base = base;}
}
