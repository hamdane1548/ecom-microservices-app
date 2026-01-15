package net.oussama.inventory;

import net.oussama.inventory.entites.Product;
import net.oussama.inventory.repository.Productrepositroy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }
    @Bean
    CommandLineRunner init(Productrepositroy sp) {
        return args -> {
            sp.save(Product.builder().name("computer").price(2300).quantity(23).build());
            sp.save(Product.builder().name("tv").price(5300).quantity(33).build());
            sp.save(Product.builder().name("phone").price(7300).quantity(10).build());
        };
    }
}
