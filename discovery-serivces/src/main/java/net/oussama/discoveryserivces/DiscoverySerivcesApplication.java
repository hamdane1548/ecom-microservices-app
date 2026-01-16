package net.oussama.discoveryserivces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverySerivcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoverySerivcesApplication.class, args);
    }

}
