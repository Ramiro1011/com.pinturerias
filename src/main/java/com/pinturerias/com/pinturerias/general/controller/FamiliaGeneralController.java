package com.pinturerias.com.pinturerias.general.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.BaseController;
import com.pinturerias.com.pinturerias.general.entity.FamiliaGeneral;
import com.pinturerias.com.pinturerias.general.service.FamiliaGeneralService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/general/familia")
public class FamiliaGeneralController extends BaseController<FamiliaGeneral> {
    public FamiliaGeneralController(FamiliaGeneralService service){
        super(service);
    }
}
