package com.pinturerias.com.pinturerias.general.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.BaseController;
import com.pinturerias.com.pinturerias.general.entity.BasePinturaGeneral;
import com.pinturerias.com.pinturerias.general.service.BasePinturaGeneralService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/general/base_pintura")
public class BasePinturaGeneralController extends BaseController<BasePinturaGeneral> {
    public BasePinturaGeneralController(BasePinturaGeneralService service){
        super(service);
    }
}
