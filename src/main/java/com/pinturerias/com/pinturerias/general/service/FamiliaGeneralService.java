package com.pinturerias.com.pinturerias.general.service;

import com.pinturerias.com.pinturerias.compartidos.service.BaseService;
import com.pinturerias.com.pinturerias.general.entity.FamiliaGeneral;
import com.pinturerias.com.pinturerias.general.repository.FamiliaRepository;
import org.springframework.stereotype.Service;

@Service
public class FamiliaGeneralService extends BaseService<FamiliaGeneral> {
    public FamiliaGeneralService(FamiliaRepository repository){
        super(repository);
    }
}
