package stock.tienda.service;

import stock.tienda.dto.PrendaDto;
import stock.tienda.model.Prenda;

import java.util.List;
import java.util.Optional;

public interface PrendaService {

Prenda save(Prenda prenda);

List<Prenda> findAll();

Optional<Prenda> findById(Long idPrenda);

PrendaDto updateDto(Long id, Prenda prenda);

PrendaDto getOneDto(Long idPrenda);

}
