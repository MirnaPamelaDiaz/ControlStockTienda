package stock.tienda.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precioCompra;
    private Double precioVenta;
    private String detalle;
    private String temporada;
    private Integer talle;
    private String color;
  //  @OneToOne(cascade = CascadeType.ALL)
  //  private Stock stock;
    @ManyToMany(mappedBy = "prendaLista",fetch =FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Proveedor> proveedorLista= new ArrayList<>();
    private Double porcentajeUtilidad;

}
