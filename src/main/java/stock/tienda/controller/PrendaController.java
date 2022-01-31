package stock.tienda.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;
import stock.tienda.dto.PrendaDto;
import stock.tienda.model.Prenda;
import stock.tienda.service.PrendaService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
    @GetMapping("/export")
    public void exportToCsv(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        String fileName = "prendas.csv";
        String headerKey = "Content-Disposition";
        String headerValue = "attachment;filename = "+ fileName;
        response.setHeader(headerKey,headerValue);
        List<Prenda> listaPrendas = prendaService.findAll();
        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
        String[] csvHeader = {"codigo Prenda", "nombre","pCpmpra","pVenta","detalle","temporada","talle","color","%Utilidad"};
        String[] nameMapping = {"id","nombre","precioCompra","precioVenta","detalle","temporada","talle","color","porcentajeUtilidad"};
        csvWriter.writeHeader(csvHeader);

        for (Prenda prenda : listaPrendas) {
            csvWriter.write(prenda,nameMapping);
        }
        csvWriter.close();

    }

}
//nombre_del_mapper.map(nombre_objeto_a_mappear,nombre_de_la_clase.class)

