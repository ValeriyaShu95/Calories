package org.example.calories.controllers;

import org.example.calories.models_entity.ClientFood;
import org.example.calories.repo.ClientFoodRepo;
import org.example.calories.repo.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ResrController {
    private ProductsRepo productsRepo;
    private ClientFoodRepo clientFoodRepo;

    @Autowired
    public ResrController(ProductsRepo productsRepo, ClientFoodRepo clientFoodRepo) {
        this.productsRepo = productsRepo;
        this.clientFoodRepo = clientFoodRepo;
    }

    @GetMapping("/jjj")
    public List<Date> clientFoodList(@RequestBody String product) {
        System.out.println(product);
        List<Date> dataList = clientFoodRepo.getDate(product);
        return dataList;
    }



}
