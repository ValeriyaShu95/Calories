package org.example.calories.models;


import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "ClientFood")
public class ClientFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfProduct;
    private Long grams;
    private Date date;


    public ClientFood() {
    }

    public ClientFood(String nameOfProduct, Long grams) {
        Date date = new Date();
        this.nameOfProduct = nameOfProduct;
        this.grams = grams;
        this.date = date;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
