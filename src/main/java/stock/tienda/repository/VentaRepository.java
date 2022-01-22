package stock.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.tienda.model.Venta;

public interface VentaRepository extends JpaRepository<Venta,Long> {
}
