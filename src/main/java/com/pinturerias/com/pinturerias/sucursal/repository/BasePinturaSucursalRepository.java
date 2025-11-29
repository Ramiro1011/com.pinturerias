package com.pinturerias.com.pinturerias.sucursal.repository;

import com.pinturerias.com.pinturerias.general.entity.BasePinturaGeneral;
import com.pinturerias.com.pinturerias.sucursal.entity.BasePinturaSucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasePinturaSucursalRepository extends JpaRepository<BasePinturaSucursal, Long> {
}
