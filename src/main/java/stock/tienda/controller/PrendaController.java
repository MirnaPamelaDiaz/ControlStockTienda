package stock.tienda.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stock.tienda.dto.PrendaDto;
import stock.tienda.model.Prenda;
import stock.tienda.service.PrendaService;

@RestController
@RequestMapping("/prenda")
public class PrendaController {
    @Autowired
    PrendaService prendaService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearPrenda(@RequestBody Prenda prenda){
        return ResponseEntity.ok().body(prendaService.save(prenda));
    }

    @PutMapping("/modificar")
    public ResponseEntity<?> modificarPrenda(@RequestBody Prenda prenda){
        return ResponseEntity.ok().body(prendaService.updateDto(prenda));
    }

    @GetMapping("/ver_prenda/{id}")
    public ResponseEntity<?> verPrenda(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(prendaService.getOneDto(id));

    }


}
//nombre_del_mapper.map(nombre_objeto_a_mappear,nombre_de_la_clase.class)

