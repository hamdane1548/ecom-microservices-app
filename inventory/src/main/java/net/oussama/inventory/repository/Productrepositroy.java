package net.oussama.inventory.repository;

import net.oussama.inventory.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Productrepositroy extends JpaRepository<Product,Long> {
}
