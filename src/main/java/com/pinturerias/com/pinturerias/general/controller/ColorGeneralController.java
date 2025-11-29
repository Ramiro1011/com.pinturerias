package com.pinturerias.com.pinturerias.general.controller;

import com.pinturerias.com.pinturerias.compartidos.controller.ColorController;
import com.pinturerias.com.pinturerias.general.entity.ColorGeneral;
import com.pinturerias.com.pinturerias.general.service.ColorGeneralService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/general/color")
public class ColorGeneralController extends ColorController<ColorGeneral> {
    public ColorGeneralController(ColorGeneralService service){
        super(service);
    }
}
