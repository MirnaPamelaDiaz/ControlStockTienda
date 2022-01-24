package stock.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.tienda.model.Prenda;
import stock.tienda.model.Venta;

import java.util.Optional;

@Repository
public interface VentaRepository extends JpaRepository<Venta,Long> {
    Optional<Venta> findById(Long id);
}
