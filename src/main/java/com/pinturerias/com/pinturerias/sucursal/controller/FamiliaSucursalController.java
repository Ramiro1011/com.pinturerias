package com.pinturerias.com.pinturerias.sucursal.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.BaseController;
import com.pinturerias.com.pinturerias.general.entity.FamiliaGeneral;
import com.pinturerias.com.pinturerias.general.service.FamiliaGeneralService;
import com.pinturerias.com.pinturerias.sucursal.entity.FamiliaSucursal;
import com.pinturerias.com.pinturerias.sucursal.service.FamiliaSucursalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sucursal/{sucursalId}/familia")
public class FamiliaSucursalController extends BaseController<FamiliaSucursal> {
    public FamiliaSucursalController(FamiliaSucursalService service){
        super(service);
    }
}
