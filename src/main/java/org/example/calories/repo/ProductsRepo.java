package org.example.calories.repo;
import org.example.calories.models.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends CrudRepository<Products, Long> {
    @Query(nativeQuery = true, value = "SELECT p.id, p.name_of_products, p.calorie_index_in100 FROM products p WHERE p.name_of_products = :nameOfProduct")
    Products getCalories(@Param("nameOfProduct") String nameOfProduct);

}
