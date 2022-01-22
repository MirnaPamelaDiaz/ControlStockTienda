package stock.tienda.service;

import stock.tienda.model.Stock;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface StockService {

    Stock save(Stock stock);
    Optional<Stock> findById(Long id);
    List<Stock> findAll();
    List<Stock> findByFechaIngreso(Date fechaImgreso);
}
