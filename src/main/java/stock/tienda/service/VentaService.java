package stock.tienda.service;

import stock.tienda.model.Prenda;
import stock.tienda.model.Venta;

import java.util.Optional;

public interface VentaService {
    Optional<Venta> findById(Long id);
}
