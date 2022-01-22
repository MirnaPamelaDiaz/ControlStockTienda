package stock.tienda.service;

import stock.tienda.model.Prenda;

import java.util.List;
import java.util.Optional;

public interface PrendaService {

Prenda save(Prenda prenda);

Prenda update(Long idPrenda, Prenda prenda);

List<Prenda> findAll();

Optional<Prenda> findById(Long idPrenda);

}
