package com.pinturerias.com.pinturerias.sucursal.service;

import com.pinturerias.com.pinturerias.compartidos.service.BaseService;
import com.pinturerias.com.pinturerias.sucursal.entity.BasePinturaSucursal;
import com.pinturerias.com.pinturerias.sucursal.repository.BasePinturaSucursalRepository;
import org.springframework.stereotype.Service;

@Service
public class BasePinturaSucursalService extends BaseService<BasePinturaSucursal> {
    public BasePinturaSucursalService(BasePinturaSucursalRepository repository) {
        super(repository);
    }
}
