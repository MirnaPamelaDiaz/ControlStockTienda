package stock.tienda.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.tienda.model.Venta;
import stock.tienda.repository.VentaRepository;

import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService{

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public Optional<Venta> findById(Long id) {
        return ventaRepository.findById(id);
    }


}
