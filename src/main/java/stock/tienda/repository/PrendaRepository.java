package stock.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.tienda.model.Prenda;

import java.util.Optional;

@Repository
public interface PrendaRepository extends JpaRepository<Prenda, Long>{

}
