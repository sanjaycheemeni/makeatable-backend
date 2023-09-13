package com.makeatable.makeatable.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.makeatable.makeatable.model.Food;
import com.makeatable.makeatable.repository.FoodRepo;

import lombok.extern.slf4j.Slf4j;
// @RequiredArgsConstructor
@Service
@Slf4j
public class FoodService {

    public final FoodRepo foodrepo;

    FoodService(FoodRepo foodRepo){
        this.foodrepo=foodRepo;
    }
    
    
    public List<Food> getAllFoods(){
        log.info("Makeatable [food]: returning food list ");
        return foodrepo.findAll();
    }

   

    public Food addFood(Food food) {
         log.info("Makeatable [food]: Creating new food item in DB");
        return foodrepo.save(food);
    }

    

}
