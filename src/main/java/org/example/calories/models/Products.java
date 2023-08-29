package org.example.calories.models;



import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfProducts;
    private long calorieIndexIn100;

    public Products() {
    }

    public Products(String nameOfProducts, long calorieIndexIn100) {
        this.nameOfProducts = nameOfProducts;
        this.calorieIndexIn100 = calorieIndexIn100;
    }

    public String getNameOfProducts() {
        return nameOfProducts;
    }

    public void setNameOfProducts(String nameOfProducts) {
        this.nameOfProducts = nameOfProducts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCalorieIndexIn100() {
        return calorieIndexIn100;
    }

    public void setCalorieIndexIn100(long calorieIndexIn100) {
        this.calorieIndexIn100 = calorieIndexIn100;
    }
}

