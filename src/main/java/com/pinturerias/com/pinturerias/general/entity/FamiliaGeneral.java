package com.pinturerias.com.pinturerias.general.entity;

import com.pinturerias.com.pinturerias.compartidos.entity.Categoria;
import com.pinturerias.com.pinturerias.compartidos.entity.Familia;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "familia")
@Data
public class FamiliaGeneral extends Familia {
}
