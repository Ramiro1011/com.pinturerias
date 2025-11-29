package com.pinturerias.com.pinturerias.sucursal.entity;

import com.pinturerias.com.pinturerias.compartidos.entity.BasePintura;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "base_pintura")
@Data
public class BasePinturaSucursal extends BasePintura {
}
