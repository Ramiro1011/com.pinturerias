package com.pinturerias.com.pinturerias.general.controller;

import com.pinturerias.com.pinturerias.compartidos.dto.ProductoDTO;
import com.pinturerias.com.pinturerias.compartidos.entity.Producto;
import com.pinturerias.com.pinturerias.compartidos.enumerate.ContextoProducto;
import com.pinturerias.com.pinturerias.general.service.ProductoGeneralService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/general/productos")
public class ProductoGeneralController {

    private final ProductoGeneralService service;

    public ProductoGeneralController(ProductoGeneralService service) {
        this.service = service;
    }

    @GetMapping
    public List<Producto> listar() {
        return service.listar();
    }

    @PostMapping
    public Producto crear(
            @RequestBody ProductoDTO dto
    ) {
        // el contexto SIEMPRE general para este controller
        dto.setContexto(ContextoProducto.GENERAL);
        return service.crear(dto);
    }

    @DeleteMapping("/{id}/{tipo}")
    public void eliminar(
            @PathVariable Long id,
            @PathVariable String tipo
    ) {
        service.eliminar(id, tipo);
    }
}
