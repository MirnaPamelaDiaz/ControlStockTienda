package stock.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.tienda.model.Prenda;
import stock.tienda.model.Venta;

import java.util.Optional;

public interface VentaRepository extends JpaRepository<Venta,Long> {
    Optional<Venta> findById(Long id);
}
