package com.pinturerias.com.pinturerias.sucursal.service;


import com.pinturerias.com.pinturerias.compartidos.service.ColorService;
import com.pinturerias.com.pinturerias.sucursal.entity.ColorSucursal;
import com.pinturerias.com.pinturerias.sucursal.repository.ColorSucursalRepository;
import org.springframework.stereotype.Service;

@Service
public class ColorSucursalService extends ColorService<ColorSucursal> {
    public ColorSucursalService(ColorSucursalRepository repository){
        super(repository);
    }
}
