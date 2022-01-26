package stock.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import stock.tienda.model.Prenda;

import java.util.Optional;

@Repository
public interface PrendaRepository extends JpaRepository<Prenda, Long>{

    //Prenda update(Long id, Prenda prenda);


    @Modifying
    @Query(value = "INSERT INTO proveedor_prenda_lista (proveedor_lista_id,prenda_lista_id) " +
            "VALUES (?2,?1)",nativeQuery = true)
    void insertRelacion(Long idPrenda,Long idProveedor);


}
