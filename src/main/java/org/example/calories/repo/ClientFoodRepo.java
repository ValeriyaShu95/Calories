package org.example.calories.repo;

import org.example.calories.models_entity.ClientFood;
import org.example.calories.models_entity.Products;
import org.example.calories.models_entity.Statistic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;



@Repository
public interface ClientFoodRepo extends CrudRepository<ClientFood, Long> {

    @Query(value = "SELECT "
            + " new org.example.calories.models_entity.Statistic(c.date as date, sum(c.grams * p.calorieIndexIn100) as caloriesAmount)  "
            + "FROM ClientFood c "
            + " join Products p ON c.nameOfProduct = p.nameOfProducts "
            + "group by c.date")
    List<Statistic> statistic();

    @Query(nativeQuery = true, value = "SELECT c.date FROM client_food c WHERE c.name_of_product = :product")
    List<Date> getDate(@Param("product") String product); // это параметр для фильтрации
}
