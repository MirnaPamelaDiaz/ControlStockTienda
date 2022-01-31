package stock.tienda.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StockDto implements Serializable {

    private Long id;
    private Integer stockInicial;
    private Integer stockRestante;
    private Integer stockTotal;
    @JsonIgnoreProperties(value = "stock")
    private PrendaDto prenda;
    private Date fechaIngreso;
}
