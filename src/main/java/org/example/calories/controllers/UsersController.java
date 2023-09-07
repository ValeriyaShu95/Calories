package org.example.calories.controllers;

import org.example.calories.models_entity.Users;
import org.example.calories.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    private UserRepo userRepo;

    @Autowired
    public UsersController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }




    @GetMapping("/users")
    public String getName(){
        return "Ваше имя";
    }


    @PostMapping("/users")
    public String postName(@RequestBody String name) {
         Users users = new Users(name);
         userRepo.save(users);

        return name;
    }

}
