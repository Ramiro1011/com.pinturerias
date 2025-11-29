package com.pinturerias.com.pinturerias.general.service;

import com.pinturerias.com.pinturerias.compartidos.service.BaseService;
import com.pinturerias.com.pinturerias.general.entity.BasePinturaGeneral;
import com.pinturerias.com.pinturerias.general.repository.BasePinturaRepository;
import org.springframework.stereotype.Service;

@Service
public class BasePinturaGeneralService extends BaseService<BasePinturaGeneral> {
    public BasePinturaGeneralService(BasePinturaRepository repository) {
        super(repository);
    }
}
