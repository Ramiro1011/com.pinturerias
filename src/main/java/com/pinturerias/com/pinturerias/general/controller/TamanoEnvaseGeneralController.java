package com.pinturerias.com.pinturerias.general.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.BaseController;
import com.pinturerias.com.pinturerias.general.entity.TamanoEnvaseGeneral;
import com.pinturerias.com.pinturerias.general.service.TamanoEnvaseGeneralService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/general/tamano_envase")
public class TamanoEnvaseGeneralController extends BaseController<TamanoEnvaseGeneral> {
    public TamanoEnvaseGeneralController(TamanoEnvaseGeneralService service){
        super(service);
    }
}

