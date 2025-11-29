package com.pinturerias.com.pinturerias.sucursal.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.BaseController;
import com.pinturerias.com.pinturerias.sucursal.entity.TamanoEnvaseSucursal;
import com.pinturerias.com.pinturerias.sucursal.service.TamanoEnvaseSucursalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sucursal/{sucursalId}/tamano_envase")
public class TamanoEnvaseSucursalController extends BaseController<TamanoEnvaseSucursal> {
    public TamanoEnvaseSucursalController(TamanoEnvaseSucursalService service){
        super(service);
    }
}

