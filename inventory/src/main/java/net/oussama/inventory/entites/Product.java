package net.oussama.inventory.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Product {
    @Id
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
