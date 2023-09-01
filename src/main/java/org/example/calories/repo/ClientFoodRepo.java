package org.example.calories.repo;

import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.SqlResultSetMapping;
import org.example.calories.models.ClientFood;
import org.example.calories.models.Products;
import org.example.calories.models.Statistic;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@Repository
public interface ClientFoodRepo extends CrudRepository<ClientFood, Long> {

    @Query(value = "SELECT "
            + " new org.example.calories.models.Statistic(c.date as date, sum(c.grams * p.calorieIndexIn100) as caloriesAmount)  "
            + "FROM ClientFood c "
            + " join Products p ON c.nameOfProduct = p.nameOfProducts "
            + "group by c.date")
    List<Statistic> statistic();
}
