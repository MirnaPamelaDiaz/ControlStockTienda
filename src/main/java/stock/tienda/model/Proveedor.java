package stock.tienda.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Prenda> prendaLista = new ArrayList<>();
    private  String mail;
    private  Long telefono;
    private String nombre;
    private  String direcccion;
    private  String zona;
    private Boolean estado;
}
