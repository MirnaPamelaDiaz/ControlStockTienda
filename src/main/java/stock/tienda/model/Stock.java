package stock.tienda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer stockInicial;
    private Integer stockRestante;
    private Integer stockTotal;

    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

}

/*Long id
Prenda prenda
Integer inicial
Integer total
Integer restante
Date fechaIngreso*/
