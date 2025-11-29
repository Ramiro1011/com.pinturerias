package com.pinturerias.com.pinturerias.sucursal.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.ColorController;
import com.pinturerias.com.pinturerias.sucursal.entity.ColorSucursal;
import com.pinturerias.com.pinturerias.sucursal.service.ColorSucursalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sucursal/{sucursalId}/color")
public class ColorSucursalController extends ColorController<ColorSucursal> {
    public ColorSucursalController(ColorSucursalService service){
        super(service);
    }
}
