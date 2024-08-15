package com.has.iOSPj.MyanmarFoods.api.controller;

import com.has.iOSPj.MyanmarFoods.api.model.Dish;
import com.has.iOSPj.MyanmarFoods.api.model.User;
import com.has.iOSPj.MyanmarFoods.service.DishService;
import com.has.iOSPj.MyanmarFoods.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DishController {

    private final DishService dishService;
    @Autowired
    public DishController(DishService dishService){
        this.dishService = dishService;
    }

    @GetMapping("/dishes")
    public List<Dish> getAllDishes() {
        return dishService.getAllDishes();
    }
}
