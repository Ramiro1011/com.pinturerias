package com.pinturerias.com.pinturerias.general.entity;

import com.pinturerias.com.pinturerias.compartidos.entity.ColorBase;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "color")
@Data
public class ColorGeneral extends ColorBase {

}
