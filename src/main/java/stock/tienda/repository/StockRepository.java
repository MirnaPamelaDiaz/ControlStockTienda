package stock.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.tienda.model.Stock;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface StockRepository extends JpaRepository<Stock,Long> {

    Optional<Stock> findById(Long id);
    List<Stock> findAll();
    List<Stock> findByFechaIngreso(Date fechaIngreso);
}
