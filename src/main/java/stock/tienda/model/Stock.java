package stock.tienda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer stockInicial;
    private Integer stockRestante;
    private Integer stockTotal;
    @OneToOne(mappedBy = "stock", cascade = CascadeType.ALL)
    @JoinColumn(name = "prenda_id")
    private Prenda prenda;
    @CreatedDate
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

}

/*Long id
Prenda prenda
Integer inicial
Integer total
Integer restante
Date fechaIngreso*/
