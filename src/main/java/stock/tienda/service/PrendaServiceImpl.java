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

import java.util.Date;
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
        prenda= prendaRepository.save(prenda);
        if(!prenda.getProveedorLista().isEmpty()){
            for (Proveedor proveedor: prenda.getProveedorLista()) {
                prendaRepository.insertRelacion(prenda.getId(),proveedor.getId());
            }
        }
        return prenda;
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
    public PrendaDto updateDto(Long id, Prenda prendaActualizada){
        Prenda prendaAnterior = prendaRepository.findById(id).get();
        prendaAnterior.setNombre((prendaActualizada.getNombre()));
        prendaAnterior.setColor(prendaActualizada.getColor());
        prendaAnterior.setDetalle(prendaActualizada.getDetalle());
        prendaAnterior.setPrecioCompra(prendaActualizada.getPrecioCompra());
        prendaAnterior.setPrecioVenta(prendaActualizada.getPrecioVenta());
        prendaAnterior.setTalle(prendaActualizada.getTalle());
        prendaAnterior.setPorcentajeUtilidad(prendaActualizada.getPorcentajeUtilidad());
        prendaAnterior.setProveedorLista(prendaActualizada.getProveedorLista());
        //prendaAnterior.setStock(prendaActualizada.getStock());
        //prendaAnterior.getStock().setFechaIngreso(new Date());
        return mapper.map(prendaRepository.save(prendaAnterior),PrendaDto.class);
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
