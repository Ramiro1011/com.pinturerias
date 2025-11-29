package com.pinturerias.com.pinturerias.sucursal.entity;

import com.pinturerias.com.pinturerias.compartidos.entity.Categoria;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "categoria")
@Data
public class CategoriaSucursal extends Categoria {
}
