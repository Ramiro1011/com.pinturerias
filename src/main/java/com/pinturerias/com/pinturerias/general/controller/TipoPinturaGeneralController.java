package com.pinturerias.com.pinturerias.general.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.TipoPinturaController;
import com.pinturerias.com.pinturerias.general.entity.TipoPinturaGeneral;
import com.pinturerias.com.pinturerias.general.service.TipoPinturaGeneralService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/general/tipo_pintura")
public class TipoPinturaGeneralController extends TipoPinturaController<TipoPinturaGeneral> {
    public TipoPinturaGeneralController(TipoPinturaGeneralService service){
        super(service);
    }
}
