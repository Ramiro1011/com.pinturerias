package com.pinturerias.com.pinturerias.sucursal.controller;

import com.pinturerias.com.pinturerias.compartidos.dto.ProductoDTO;
import com.pinturerias.com.pinturerias.compartidos.entity.Producto;
import com.pinturerias.com.pinturerias.compartidos.enumerate.ContextoProducto;
import com.pinturerias.com.pinturerias.sucursal.dto.ProductoSucursalViewDTO;
import com.pinturerias.com.pinturerias.sucursal.service.ProductoSucursalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sucursal/{sucursalId}/productos")
public class ProductoSucursalController {

    private final ProductoSucursalService service;

    public ProductoSucursalController(ProductoSucursalService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductoSucursalViewDTO> listar() {
        return service.listarProductosVisibles();
    }

    @PostMapping
    public Producto crear(
            @PathVariable Long sucursalId,
            @RequestBody ProductoDTO dto
    ) {
        // el contexto SIEMPRE sucursal para este controller
        dto.setContexto(ContextoProducto.SUCURSAL);
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
