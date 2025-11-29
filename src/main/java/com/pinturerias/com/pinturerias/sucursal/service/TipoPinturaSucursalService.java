package com.pinturerias.com.pinturerias.sucursal.service;

import com.pinturerias.com.pinturerias.compartidos.service.TipoPinturaService;
import com.pinturerias.com.pinturerias.sucursal.entity.TipoPinturaSucursal;
import com.pinturerias.com.pinturerias.sucursal.repository.TipoPinturaSucursalRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoPinturaSucursalService extends TipoPinturaService<TipoPinturaSucursal> {
    public TipoPinturaSucursalService(TipoPinturaSucursalRepository repository){
        super(repository);
    }
}
