package com.pinturerias.com.pinturerias.sucursal.service;

import com.pinturerias.com.pinturerias.sucursal.entity.ProductoPrecioStock;
import com.pinturerias.com.pinturerias.sucursal.repository.ProductoPrecioStockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoPrecioStockService {
    private final ProductoPrecioStockRepository repo;

    public ProductoPrecioStockService(ProductoPrecioStockRepository repo) { this.repo = repo;}

    public List<ProductoPrecioStock> listar() {
        return repo.findAll();
    }

    public ProductoPrecioStock crear(ProductoPrecioStock p) {
        return repo.save(p);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
