package com.pinturerias.com.pinturerias.general.service;

import com.pinturerias.com.pinturerias.compartidos.service.BaseService;
import com.pinturerias.com.pinturerias.general.entity.TamanoEnvaseGeneral;
import com.pinturerias.com.pinturerias.general.repository.TamanoEnvaseRepository;
import org.springframework.stereotype.Service;

@Service
public class TamanoEnvaseGeneralService extends BaseService<TamanoEnvaseGeneral> {
    public TamanoEnvaseGeneralService(TamanoEnvaseRepository repository){
        super(repository);
    }
}
