package stock.tienda.service;

import stock.tienda.model.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ProveedorService {

     Proveedor save(Proveedor proveedor);

      Proveedor update(Long idProveedor, Proveedor proveedor);

      List<Proveedor> findAll();

      Optional<Proveedor> findById(Long idProveedor);

}
