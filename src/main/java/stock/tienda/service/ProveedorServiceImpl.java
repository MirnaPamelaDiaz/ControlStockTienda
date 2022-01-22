package stock.tienda.service;

import org.springframework.stereotype.Service;
import stock.tienda.model.Proveedor;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServiceImpl implements ProveedorService{
    @Override
    public Proveedor save(Proveedor proveedor) {
        return null;
    }

    @Override
    public Proveedor update(Long idProveedor, Proveedor proveedor) {
        return null;
    }

    @Override
    public List<Proveedor> findAll() {
        return null;
    }

    @Override
    public Optional<Proveedor> findById(Long idProveedor) {
        return Optional.empty();
    }
}
