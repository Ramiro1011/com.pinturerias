package com.pinturerias.com.pinturerias.compartidos.entity.general;

import com.pinturerias.com.pinturerias.general.entity.*;
import com.pinturerias.com.pinturerias.compartidos.entity.Producto;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "producto_pintura")
@Data
public class ProductoPinturaGeneral extends Producto {
    @ManyToOne
    private FamiliaGeneral familia;
    @ManyToOne
    private CategoriaGeneral categoria;
    @ManyToOne
    private TipoPinturaGeneral tipoPinturaGeneral;
    @ManyToOne
    private ColorGeneral colorGeneral;
    @ManyToOne
    private TamanoEnvaseGeneral tamEnv;

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
}
