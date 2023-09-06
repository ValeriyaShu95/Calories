package org.example.calories.models_entity;

public class Person {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Person(){

    }

    public Person(int id,String name, int age) {
        super();
        this.id=id;
        this.name = name;
        this.age = age;
    }
}
