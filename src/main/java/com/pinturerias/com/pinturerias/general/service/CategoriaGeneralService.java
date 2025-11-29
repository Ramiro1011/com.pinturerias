package com.pinturerias.com.pinturerias.general.service;

import com.pinturerias.com.pinturerias.compartidos.service.BaseService;
import com.pinturerias.com.pinturerias.general.entity.CategoriaGeneral;
import com.pinturerias.com.pinturerias.general.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaGeneralService extends BaseService<CategoriaGeneral> {
    public CategoriaGeneralService(CategoriaRepository repository){
        super(repository);
    }

}
