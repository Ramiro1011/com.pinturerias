package com.pinturerias.com.pinturerias.sucursal.service;

import com.pinturerias.com.pinturerias.compartidos.service.BaseService;
import com.pinturerias.com.pinturerias.sucursal.entity.CategoriaSucursal;
import com.pinturerias.com.pinturerias.sucursal.repository.CategoriaSucursalRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaSucursalService extends BaseService<CategoriaSucursal> {
    public CategoriaSucursalService(CategoriaSucursalRepository repository){
        super(repository);

    }
}
