package org.example.calories.repo;

import org.example.calories.models.ClientFood;
import org.example.calories.models.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientFoodRepo extends CrudRepository<ClientFood, Long> {

}
