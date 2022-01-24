package stock.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import stock.tienda.model.Prenda;

import java.util.Optional;

@Repository
public interface PrendaRepository extends JpaRepository<Prenda, Long>{
    Prenda update(Long id, Prenda prenda);


  /*  @Modifying
    @Query(value = "UPDATE id,nombre,precioCompra,precioVenta,detalle,temporada,talle,color, proveedor,porcentajeUtilidad" +
            "WHERE prenda.nombre = :nombre" +
            "prenda.precioCompra = :precioCompra," +
            "prenda.precioVenta = :precioVenta," +
            "prenda.detalle = :detalle," +
            "prenda.temporada = :temporada," +
            "prenta.talle = :talle," +
            "prenda.color = :color," +
            "prenda.proveedor = :proveedor," +
            "prenda.porcentajeUtilidad = porcentajeUtilidad")
    Prenda findPrenda();*/


}
