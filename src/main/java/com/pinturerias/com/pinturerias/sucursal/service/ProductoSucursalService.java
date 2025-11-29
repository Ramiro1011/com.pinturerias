package com.pinturerias.com.pinturerias.sucursal.service;

import com.pinturerias.com.pinturerias.compartidos.director.ProductoDirector;
import com.pinturerias.com.pinturerias.compartidos.dto.ProductoDTO;
import com.pinturerias.com.pinturerias.compartidos.entity.Producto;
import com.pinturerias.com.pinturerias.compartidos.entity.sucursal.ProductoOtroSucursal;
import com.pinturerias.com.pinturerias.compartidos.entity.sucursal.ProductoPinturaSucursal;
import com.pinturerias.com.pinturerias.sucursal.entity.*;
import com.pinturerias.com.pinturerias.sucursal.repository.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductoSucursalService {

    private final ProductoDirector director;
    private final ProductoPinturaSucursalRepository pinturaRepo;
    private final ProductoOtroSucursalRepository otroRepo;

    private final CategoriaSucursalRepository categoriaRepo;
    private final FamiliaSucursalRepository familiaRepo;
    private final TamanoEnvaseSucursalRepository tamanoRepo;
    private final BasePinturaSucursalRepository baseRepo;

    private final ColorSucursalRepository colorRepo;             // compartidos
    private final TipoPinturaSucursalRepository tipoPinturaRepo;

    public ProductoSucursalService(ProductoDirector director, ProductoPinturaSucursalRepository pinturaRepo, ProductoOtroSucursalRepository otroRepo, CategoriaSucursalRepository categoriaRepo, FamiliaSucursalRepository familiaRepo, TamanoEnvaseSucursalRepository tamanoRepo, BasePinturaSucursalRepository baseRepo, ColorSucursalRepository colorRepo, TipoPinturaSucursalRepository tipoPinturaRepo) {

        this.director = director;
        this.pinturaRepo = pinturaRepo;
        this.otroRepo = otroRepo;
        this.categoriaRepo = categoriaRepo;
        this.familiaRepo = familiaRepo;
        this.tamanoRepo = tamanoRepo;
        this.baseRepo = baseRepo;
        this.colorRepo = colorRepo;
        this.tipoPinturaRepo = tipoPinturaRepo;
    }


    public Producto crear(ProductoDTO dto) {

        // 1. Resolver objetos segun ID
        CategoriaSucursal categoria = categoriaRepo.findById(dto.getCategoriaId())
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        FamiliaSucursal familia = familiaRepo.findById(dto.getFamiliaId())
                .orElseThrow(() -> new RuntimeException("Familia no encontrada"));

        TamanoEnvaseSucursal tamano = tamanoRepo.findById(dto.getTamanoEnvId())
                .orElseThrow(() -> new RuntimeException("Tamaño envase no encontrado"));

        BasePinturaSucursal base = baseRepo.findById(dto.getBasePinturaId())
                .orElseThrow(() -> new RuntimeException("Base pintura no encontrada"));

        ColorSucursal color = colorRepo.findById(dto.getColorId())
                .orElseThrow(() -> new RuntimeException("Color no encontrado"));

        TipoPinturaSucursal tipoPintura = tipoPinturaRepo.findById(dto.getTipoPinturaId())
                .orElseThrow(() -> new RuntimeException("Tipo pintura no encontrado"));

        // 2. Pasar los objetos al director
        Map<String, Object> objetos = Map.of(
                "categoria", categoria,
                "familia", familia,
                "tamano", tamano,
                "base", base,
                "color", color,
                "tipoPintura", tipoPintura
        );

        // 3. Construir el producto final usando el Director
        Producto producto = director.construirProducto(dto, objetos);

        // 4. Guardado según el tipo (pero sin instanceof)
        return guardarSegunTipo(producto);
    }

    private Producto guardarSegunTipo(Producto producto) {

        switch (producto.getClass().getSimpleName()) {

            case "ProductoPinturaSucursal" -> {
                return pinturaRepo.save((ProductoPinturaSucursal) producto);
            }

            case "ProductoOtroSucursal" -> {
                return otroRepo.save((ProductoOtroSucursal) producto);
            }

            default -> throw new RuntimeException("Tipo de producto inválido");
        }
    }

    public List<Producto> listar() {
        List<Producto> lista = new ArrayList<>();

        lista.addAll(otroRepo.findAll());
        lista.addAll(pinturaRepo.findAll());

        return lista;
    }

    public void eliminar(Long id, String tipo) {

        if (tipo.equalsIgnoreCase("otro")) {
            if (!otroRepo.existsById(id))
                throw new RuntimeException("ProductoOtroSucursal no encontrado");
            otroRepo.deleteById(id);
            return;
        }

        if (tipo.equalsIgnoreCase("pintura")) {
            if (!pinturaRepo.existsById(id))
                throw new RuntimeException("ProductoPinturaSucursal no encontrado");
            pinturaRepo.deleteById(id);
            return;
        }

        throw new RuntimeException("Tipo inválido");
    }
}
