package org.example.calories.models;

import jakarta.persistence.*;

import java.util.Date;

public class Statistic {

    private Date date;
    private long caloriesAmount;


    public Statistic() {
    }

    public Statistic(Date date, long caloriesAmount) {
        this.date = date;
        this.caloriesAmount = caloriesAmount;

    }

    public long getCaloriesAmount() {
        return caloriesAmount;
    }

    public void setCaloriesAmount(long caloriesAmount) {
        this.caloriesAmount = caloriesAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
