package com.makeatable.makeatable.services;

import java.util.List;
import java.util.Optional;

import org.springframework.scheduling.config.Task;
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


    public Food updateFood(Food food,Long id) {

        Optional<Food> optionalTask = foodrepo.findById(id);
        if (optionalTask.isPresent()) {

            Food newfood = optionalTask.get();

            newfood.setFood_id(food.getFood_id());
            newfood.setResto_id(food.getFood_id());
            newfood.setFood_name(food.getFood_name());
            newfood.setPrice(food.getPrice());
            newfood.setStatus(food.getStatus());
            newfood.setDescription(food.getDescription());
            newfood.setImageURL(food.getImageURL());
           
            return foodrepo.save(newfood);
        }
        return null;
       
    }

    public List<Object[]> getTop5FoodDetailsWithAvgRating() {
        return foodrepo.findTop5FoodDetailsWithAvgRating();
    }

    

}
