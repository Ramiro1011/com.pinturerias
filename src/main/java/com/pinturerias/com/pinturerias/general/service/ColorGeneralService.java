package com.pinturerias.com.pinturerias.general.service;


import com.pinturerias.com.pinturerias.compartidos.service.ColorService;
import com.pinturerias.com.pinturerias.general.entity.ColorGeneral;
import com.pinturerias.com.pinturerias.general.repository.ColorRepository;
import org.springframework.stereotype.Service;



@Service
public class ColorGeneralService extends ColorService<ColorGeneral> {
    public ColorGeneralService(ColorRepository repository){
        super(repository);
    }
}
