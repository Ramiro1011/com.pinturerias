package com.pinturerias.com.pinturerias.sucursal.entity;

import com.pinturerias.com.pinturerias.compartidos.entity.Familia;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "familia")
@Data
public class FamiliaSucursal extends Familia {
}
