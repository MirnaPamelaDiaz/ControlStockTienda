package stock.tienda.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stock.tienda.dto.PrendaDto;
import stock.tienda.model.Prenda;
import stock.tienda.model.Proveedor;
import stock.tienda.repository.PrendaRepository;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class PrendaServiceImpl implements PrendaService {
    @Autowired
    PrendaRepository prendaRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public Prenda save(Prenda prenda) {

        Prenda prenda2= prendaRepository.save(prenda);
        if(!prenda2.getProveedorLista().isEmpty()){
            for (Proveedor proveedor: prenda2.getProveedorLista()) {
                prendaRepository.insertRelacion(prenda2.getId(),proveedor.getId());
            }
        }
        return prenda2;
    }

    @Override
    public Prenda update(Prenda prenda) {

        return null;
    }

    @Override
    public List<Prenda> findAll() {
        return prendaRepository.findAll();
    }

    @Override
    public Optional<Prenda> findById(Long idPrenda) {
        return prendaRepository.findById(idPrenda);
    }


    @Override
    public PrendaDto updateDto(Prenda prenda){
        Prenda p1=save(prenda);
        PrendaDto prendaDto =mapper.map(p1,PrendaDto.class);

        return prendaDto;
    }

    @Override
    public PrendaDto getOneDto(Long idPrenda) {
        PrendaDto prendaDto = new PrendaDto();
        Prenda prenda = new Prenda();

        prenda=prendaRepository.findById(idPrenda).get();
        prendaDto=mapper.map(prenda,PrendaDto.class);

        return prendaDto;
    }
}
