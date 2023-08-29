package org.example.calories.models;


import jakarta.persistence.*;

@Entity
@Table(name = "ClientFood")
public class ClientFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfProduct;
    private Long grams;

    public ClientFood() {
    }

    public ClientFood(String nameOfProduct, Long grams) {
        this.nameOfProduct = nameOfProduct;
        this.grams = grams;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public Long getGrams() {
        return grams;
    }

    public void setGrams(Long grams) {
        this.grams = grams;
    }
}
