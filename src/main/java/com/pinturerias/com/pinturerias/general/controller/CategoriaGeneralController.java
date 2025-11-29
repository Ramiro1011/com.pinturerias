package com.pinturerias.com.pinturerias.general.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.BaseController;
import com.pinturerias.com.pinturerias.general.entity.CategoriaGeneral;
import com.pinturerias.com.pinturerias.general.service.CategoriaGeneralService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/general/categoria")
public class CategoriaGeneralController extends BaseController<CategoriaGeneral> {
    public CategoriaGeneralController(CategoriaGeneralService service){
        super(service);
    }
}
