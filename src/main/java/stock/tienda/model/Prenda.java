package stock.tienda.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Prenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private Double precioCompra;
    private Double precioVenta;
    private String detalle;
    private String temporada;
    private Integer talle;
    private String color;
    private Stock stock;
    private Proveedor proveedor;
    private Double porcentajeUtilidad;
}
