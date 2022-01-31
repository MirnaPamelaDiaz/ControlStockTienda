package stock.tienda.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Prenda implements Serializable {

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
    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "stock_id")
    private Stock stock;
    @ManyToMany(mappedBy = "prendaLista",fetch =FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Proveedor> proveedorLista= new ArrayList<>();
    private Double porcentajeUtilidad;
}
