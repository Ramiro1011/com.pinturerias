package com.pinturerias.com.pinturerias.sucursal.service;

import com.pinturerias.com.pinturerias.compartidos.service.BaseService;
import com.pinturerias.com.pinturerias.sucursal.entity.TamanoEnvaseSucursal;
import com.pinturerias.com.pinturerias.sucursal.repository.TamanoEnvaseSucursalRepository;
import org.springframework.stereotype.Service;

@Service
public class TamanoEnvaseSucursalService extends BaseService<TamanoEnvaseSucursal> {
    public TamanoEnvaseSucursalService(TamanoEnvaseSucursalRepository repository){
        super(repository);
    }
}
