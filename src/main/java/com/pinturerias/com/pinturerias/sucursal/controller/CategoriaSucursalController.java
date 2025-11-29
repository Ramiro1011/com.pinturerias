package com.pinturerias.com.pinturerias.sucursal.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.BaseController;
import com.pinturerias.com.pinturerias.general.entity.CategoriaGeneral;
import com.pinturerias.com.pinturerias.general.service.CategoriaGeneralService;
import com.pinturerias.com.pinturerias.sucursal.entity.CategoriaSucursal;
import com.pinturerias.com.pinturerias.sucursal.service.CategoriaSucursalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sucursal/{sucursalId}/categoria")
public class CategoriaSucursalController extends BaseController<CategoriaSucursal> {
    public CategoriaSucursalController(CategoriaSucursalService service){
        super(service);
    }
}
