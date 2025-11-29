package com.pinturerias.com.pinturerias.sucursal.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.TipoPinturaController;
import com.pinturerias.com.pinturerias.sucursal.entity.TipoPinturaSucursal;
import com.pinturerias.com.pinturerias.sucursal.service.TipoPinturaSucursalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sucursal/{sucursalId}/tipo_pintura")
public class TipoPinturaSucursalController extends TipoPinturaController<TipoPinturaSucursal> {
    public TipoPinturaSucursalController(TipoPinturaSucursalService service){
        super(service);
    }
}
