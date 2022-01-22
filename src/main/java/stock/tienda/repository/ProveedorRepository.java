package stock.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.tienda.model.Proveedor;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Long> {
}
