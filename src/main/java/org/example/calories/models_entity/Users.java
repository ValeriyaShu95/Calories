package org.example.calories.models_entity;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    //@Column (name = "users_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String password;
    private long age;
    private long weight;
    private String sex;

    public Users() {
    }

    public Users(String name, String password, long age, long weight, String sex) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Users(String name) {
        this.name = name;
    }
}
