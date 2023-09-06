package org.example.calories.models_entity;



import jakarta.persistence.*;

import java.util.Date;

//@SqlResultSetMapping(name = "statistic",
//        classes = @ConstructorResult(
//                targetClass = org.example.calories.models.Statistic.class,
//                columns = {
//                        @ColumnResult(name = "date", type = Date.class),
//                        @ColumnResult(name = "caloriesAmount", type = Long.class),
//                }
//        )
//)
@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfProducts;
    private long calorieIndexIn100;
    private Date date;

    public Products() {
    }

    public Products(String nameOfProducts, long calorieIndexIn100) {
        Date date = new Date();
        this.nameOfProducts = nameOfProducts;
        this.calorieIndexIn100 = calorieIndexIn100;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

