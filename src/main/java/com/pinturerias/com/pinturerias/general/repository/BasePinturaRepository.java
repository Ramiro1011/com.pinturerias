package com.pinturerias.com.pinturerias.general.repository;

import com.pinturerias.com.pinturerias.general.entity.BasePinturaGeneral;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasePinturaRepository extends JpaRepository<BasePinturaGeneral, Long> {
}
