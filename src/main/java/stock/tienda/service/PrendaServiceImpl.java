package stock.tienda.service;

import org.springframework.stereotype.Service;
import stock.tienda.model.Prenda;

import java.util.List;
import java.util.Optional;

@Service
public class PrendaServiceImpl implements PrendaService {
    @Override
    public Prenda save(Prenda prenda) {
        return null;
    }

    @Override
    public Prenda update(Long idPrenda, Prenda prenda) {
        return null;
    }

    @Override
    public List<Prenda> findAll() {
        return null;
    }

    @Override
    public Optional<Prenda> findById(Long idPrenda) {
        return Optional.empty();
    }
}
