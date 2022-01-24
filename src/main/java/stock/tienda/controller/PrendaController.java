package stock.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity<?> modificarPrenda(@RequestBody Long id,@RequestBody Prenda prenda){
        return null;
    }

}
