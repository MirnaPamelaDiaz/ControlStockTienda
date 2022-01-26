package stock.tienda.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import stock.tienda.model.Prenda;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProveedorDto implements Serializable {

    private Long id;

    @JsonIgnoreProperties(value = "proveedorLista")
    private List<PrendaDto> prendaLista;
    private  String mail;
    private  Long telefono;
    private String nombre;
    private  String direcccion;
    private  String zona;
    private Boolean estado;
}
