package com.pinturerias.com.pinturerias.sucursal.service;

import com.pinturerias.com.pinturerias.compartidos.service.BaseService;
import com.pinturerias.com.pinturerias.sucursal.entity.FamiliaSucursal;
import com.pinturerias.com.pinturerias.sucursal.repository.FamiliaSucursalRepository;
import org.springframework.stereotype.Service;

@Service
public class FamiliaSucursalService extends BaseService<FamiliaSucursal> {
    public FamiliaSucursalService(FamiliaSucursalRepository repository){
        super(repository);
    }
}
