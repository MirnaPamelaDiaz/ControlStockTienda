package stock.tienda.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stock.tienda.model.Prenda;
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

    /***
     *  private Long id;
     *     private String nombre;
     *     private Double precioCompra;
     *     private Double precioVenta;
     *     private String detalle;
     *     private String temporada;
     *     private Integer talle;
     *     private String color;
     *    // private Stock stock;
     *     @ManyToMany(mappedBy = "prenda", fetch =FetchType.LAZY, cascade = CascadeType.ALL)
     *     private List<Proveedor> proveedor;
     *     private Double porcentajeUtilidad;
     * @param prenda
     * @return
     */
    @Override
    public Prenda save(Prenda prenda) {
       return prendaRepository.save(prenda);
    }

    @Override
    public Prenda update(Long idPrenda, Prenda prenda) {

        return prendaRepository.update();
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
