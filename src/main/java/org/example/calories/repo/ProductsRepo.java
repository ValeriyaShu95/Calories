package org.example.calories.repo;
import org.example.calories.models_entity.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductsRepo extends CrudRepository<Products, Long> {
    @Query(nativeQuery = true, value = "SELECT p.id, p.name_of_products, p.calorie_index_in100, p.date FROM products p WHERE p.name_of_products = :nameOfProduct")
    Products getCalories(@Param("nameOfProduct") String nameOfProduct);
    @Query(nativeQuery = true, value = "SELECT p.id, p.name_of_products, p.calorie_index_in100, p.date FROM products p WHERE p.date = :date")
    Products getDate(@Param("date") Date date); // это параметр для фильтрации

    @Query(nativeQuery = true, value = "SELECT p.name_of_products FROM products p")
    String[] listOfProducts();


}
