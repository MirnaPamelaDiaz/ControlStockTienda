package stock.tienda.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stock.tienda.model.Stock;
import stock.tienda.repository.StockRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class StockServiceImpl implements StockService{

    private final StockRepository stockRepository;

    @Override
    public Stock save(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Optional<Stock> findById(Long id) {
        return stockRepository.findById(id);
    }

    @Override
    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public List<Stock> findByFechaIngreso(Date fechaIngreso) {
        return stockRepository.findByFechaIngreso(fechaIngreso);
    }
}
