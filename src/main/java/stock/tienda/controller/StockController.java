package stock.tienda.controller;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import stock.tienda.model.Stock;
import stock.tienda.service.StockService;

import java.net.URI;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok().body(stockService.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Stock stock){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/stock/save").toUriString());
        return ResponseEntity.created(uri).body(stockService.save(stock));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Stock stock){
        return ResponseEntity.ok().body(stockService.save(stock));
    }

    @GetMapping(params = "idStock")
    public ResponseEntity<?> findById(@RequestParam("idStock") Long id){
        return ResponseEntity.ok().body(stockService.findById(id));
    }
}*/
