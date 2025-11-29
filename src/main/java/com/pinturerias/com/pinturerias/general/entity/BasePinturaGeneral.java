package com.pinturerias.com.pinturerias.general.entity;

import com.pinturerias.com.pinturerias.compartidos.entity.BasePintura;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "base_pintura_general")
@Data
public class BasePinturaGeneral extends BasePintura {
}
