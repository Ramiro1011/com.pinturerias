package com.pinturerias.com.pinturerias.general.entity;

import com.pinturerias.com.pinturerias.compartidos.entity.TipoPintura;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_pintura")
@Data
public class TipoPinturaGeneral extends TipoPintura {

}
