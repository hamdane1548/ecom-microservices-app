package net.oussama.customerservices;

import net.oussama.customerservices.entites.Customer;
import net.oussama.customerservices.repositroy.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServicesApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args ->{
            customerRepository.save(Customer.builder().name("oussama").email("oussamahamdane@gmail.com").build());
            customerRepository.save(Customer.builder().name("Jade").email("Jadehamdane@gmail.com").build());
            customerRepository.save(Customer.builder().name("Janat").email("Janathamdane@gmail.com").build());
        };
    }
}
