package com.pinturerias.com.pinturerias.general.service;

import com.pinturerias.com.pinturerias.compartidos.service.TipoPinturaService;
import com.pinturerias.com.pinturerias.general.entity.TipoPinturaGeneral;
import com.pinturerias.com.pinturerias.general.repository.TipoPinturaRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoPinturaGeneralService extends TipoPinturaService<TipoPinturaGeneral> {
    public TipoPinturaGeneralService(TipoPinturaRepository repository){
        super(repository);
    }
}
