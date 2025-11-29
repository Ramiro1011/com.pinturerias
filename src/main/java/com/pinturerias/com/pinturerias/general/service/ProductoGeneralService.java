package com.pinturerias.com.pinturerias.general.service;

import com.pinturerias.com.pinturerias.compartidos.director.ProductoDirector;
import com.pinturerias.com.pinturerias.compartidos.dto.ProductoDTO;
import com.pinturerias.com.pinturerias.compartidos.entity.Producto;
import com.pinturerias.com.pinturerias.compartidos.entity.general.ProductoOtroGeneral;
import com.pinturerias.com.pinturerias.compartidos.entity.general.ProductoPinturaGeneral;
import com.pinturerias.com.pinturerias.general.entity.*;
import com.pinturerias.com.pinturerias.general.repository.*;
import com.pinturerias.com.pinturerias.sucursal.entity.*;
import com.pinturerias.com.pinturerias.sucursal.repository.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductoGeneralService {
    private final ProductoDirector director;

    private final ProductoPinturaGeneralRepository pinturaRepo;
    private final ProductoOtroGeneralRepository otroRepo;

    private final CategoriaRepository categoriaRepo;
    private final FamiliaRepository familiaRepo;
    private final TamanoEnvaseRepository tamanoRepo;

    private final ColorRepository colorRepo;             // compartidos
    private final TipoPinturaRepository tipoPinturaRepo;

    public ProductoGeneralService(ProductoDirector director, ProductoPinturaGeneralRepository pinturaRepo, ProductoOtroGeneralRepository otroRepo, CategoriaRepository categoriaRepo, FamiliaRepository familiaRepo, TamanoEnvaseRepository tamanoRepo, ColorRepository colorRepo, TipoPinturaRepository tipoPinturaRepo) {

        this.director = director;
        this.pinturaRepo = pinturaRepo;
        this.otroRepo = otroRepo;
        this.categoriaRepo = categoriaRepo;
        this.familiaRepo = familiaRepo;
        this.tamanoRepo = tamanoRepo;
        this.colorRepo = colorRepo;
        this.tipoPinturaRepo = tipoPinturaRepo;
    }


    public Producto crear(ProductoDTO dto) {

        // 1. Resolver objetos segun ID
        CategoriaGeneral categoria = categoriaRepo.findById(dto.getCategoriaId())
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        FamiliaGeneral familia = familiaRepo.findById(dto.getFamiliaId())
                .orElseThrow(() -> new RuntimeException("Familia no encontrada"));

        TamanoEnvaseGeneral tamano = tamanoRepo.findById(dto.getTamanoEnvId())
                .orElseThrow(() -> new RuntimeException("Tamaño envase no encontrado"));

        ColorGeneral color = colorRepo.findById(dto.getColorId())
                .orElseThrow(() -> new RuntimeException("Color no encontrado"));

        TipoPinturaGeneral tipoPintura = tipoPinturaRepo.findById(dto.getTipoPinturaId())
                .orElseThrow(() -> new RuntimeException("Tipo pintura no encontrado"));

        // 2. Pasar los objetos al director
        Map<String, Object> objetos = Map.of(
                "categoria", categoria,
                "familia", familia,
                "tamano", tamano,
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

            case "ProductoPinturaGeneral" -> {
                return pinturaRepo.save((ProductoPinturaGeneral) producto);
            }

            case "ProductoOtroGeneral" -> {
                return otroRepo.save((ProductoOtroGeneral) producto);
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
    public List<ProductoPinturaGeneral> listarPintura() {
        return pinturaRepo.findAll();
    }

    public List<ProductoOtroGeneral> listarOtros() {
        return otroRepo.findAll();
    }

    public Producto obtenerPorId(Long id) {
        return pinturaRepo.findById(id)
                .map(p -> (Producto)p)
                .or(() -> otroRepo.findById(id).map(p -> (Producto)p))
                .orElseThrow(() -> new RuntimeException("Producto general no encontrado"));
    }

    public void eliminar(Long id, String tipo) {

        if (tipo.equalsIgnoreCase("otro")) {
            if (!otroRepo.existsById(id))
                throw new RuntimeException("ProductoOtroGeneral no encontrado");
            otroRepo.deleteById(id);
            return;
        }

        if (tipo.equalsIgnoreCase("pintura")) {
            if (!pinturaRepo.existsById(id))
                throw new RuntimeException("ProductoPinturaGeneral no encontrado");
            pinturaRepo.deleteById(id);
            return;
        }

        throw new RuntimeException("Tipo inválido");
    }
}

