package com.pinturerias.com.pinturerias.general.repository;

import com.pinturerias.com.pinturerias.general.entity.ColorGeneral;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<ColorGeneral, Long> {
}
