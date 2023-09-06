package org.example.calories.controllers;

import org.example.calories.models_entity.ClientFood;
import org.example.calories.models_entity.Products;
import org.example.calories.models_entity.Statistic;
import org.example.calories.repo.ClientFoodRepo;
import org.example.calories.repo.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MainController {

    private ProductsRepo productsRepo;
    private ClientFoodRepo clientFoodRepo;


    @Autowired
    public MainController (ProductsRepo productsRepo, ClientFoodRepo clientFoodRepo){
        this.productsRepo = productsRepo;
        this.clientFoodRepo = clientFoodRepo;

    }

    @GetMapping("/")
    public String home() {
        return "success";
    }






    @GetMapping("/products/add")
    public String prodactsAdd(Model model) {
        return "addProduct";
    }

    @PostMapping("products/add")
    public String prodactsAddPost(@RequestParam String nameOfProducts, @RequestParam long calorieIndexIn100) {
        Products products = new Products(nameOfProducts, calorieIndexIn100);
        productsRepo.save(products);
        return "success";
    }


    @GetMapping("/products/add/by/client")
    public String productsAddByClient(Model model){
        String[] listName = productsRepo.listOfProducts();
        model.addAttribute("listName", listName);
        return "addClietFood";
    }

    @PostMapping("/products/add/by/client")
    public String productsAddByClientPost(@RequestParam String nameOfProduct, @RequestParam long grams){
//        получение калорийности
        getCalories(nameOfProduct);

        ClientFood clientFood = new ClientFood(nameOfProduct, grams);
        clientFoodRepo.save(clientFood);
        return "success";
    }

    private long getCalories(String nameOfProduct) {
        Products products = productsRepo.getCalories(nameOfProduct);
        if (products != null) {
            System.out.println(products.getCalorieIndexIn100());
            return products.getCalorieIndexIn100();
        } else {
            System.out.println("Product not found: " + nameOfProduct);
            return 0;
        }
    }

    @GetMapping("/statistic")
    public String statistic(Model model){
        List<Statistic> statisticList = clientFoodRepo.statistic();
        model.addAttribute("statisticList", statisticList);
        return "statistic";
    }
}
