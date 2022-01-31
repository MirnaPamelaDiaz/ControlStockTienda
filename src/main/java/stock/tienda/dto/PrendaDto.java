package stock.tienda.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import stock.tienda.model.Stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrendaDto implements Serializable {

    private Long id;
    private String nombre;
    private Double precioCompra;
    private Double precioVenta;
    private String detalle;
    private String temporada;
    private Integer talle;
    private String color;
    @JsonIgnoreProperties(value = "prenda")
    private Stock stock;
    @JsonIgnoreProperties(value = "prendaLista")
    private List<ProveedorDto> proveedorLista= new ArrayList<>();
    private Double porcentajeUtilidad;
}
