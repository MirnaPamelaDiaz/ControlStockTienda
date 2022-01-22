package stock.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.tienda.model.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
