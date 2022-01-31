package stock.tienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import stock.tienda.model.Prenda;
import stock.tienda.service.PrendaService;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(PrendaService prendaService) {

        return args -> {
//para que no se repita informacion el talle deberia estar aparte
            if(prendaService.findAll().isEmpty()){
                prendaService.save(new Prenda(null, "remera", 200d, 300d, "remera corta", "verano", 3, "verde", new ArrayList<>(), 50d));
                prendaService.save(new Prenda(null, "camiseta", 250d, 350d, "termica", "invierno", 2, "roja", new ArrayList<>(), 50d));
                prendaService.save(new Prenda(null, "musculosa", 300d, 450d, "", "verano", 4, "blanca", new ArrayList<>(), 50d));
                prendaService.save(new Prenda(null, "falda", 300d, 450d, "modelo A", "verano", 3, "negro", new ArrayList<>(), 50d));
                prendaService.save(new Prenda(null, "camisa", 200d, 300d, "camisa a lunares", "media-estacion", 3, "roja", new ArrayList<>(), 50d));
            }
        };
    }

}
