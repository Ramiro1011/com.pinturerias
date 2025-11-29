package com.pinturerias.com.pinturerias.sucursal.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.BaseController;
import com.pinturerias.com.pinturerias.sucursal.entity.BasePinturaSucursal;
import com.pinturerias.com.pinturerias.sucursal.service.BasePinturaSucursalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sucursal/{sucursalId}/base_pintura")
public class BasePinturaSucursalController extends BaseController<BasePinturaSucursal> {
    public BasePinturaSucursalController(BasePinturaSucursalService service){
        super(service);
    }
}
