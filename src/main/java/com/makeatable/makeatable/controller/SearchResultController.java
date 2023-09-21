package com.makeatable.makeatable.controller;

import com.makeatable.makeatable.model.Food;
import com.makeatable.makeatable.services.FoodService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;


public class SearchResultController {
    private final FoodService foodService;

    public SearchResultController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping(path = "/search")
    public ResponseEntity<Response>searchFoodByName(@RequestParam String food_name){
        List<Food> results = foodService.searchFoodByName(food_name);
        if (results.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

    Response response = Response.builder()
            .timeStamp(LocalDateTime.now())
            .data(results)
            .message("Search results for food_name: " + food_name)
            .status(HttpStatus.OK)
            .statusCode(HttpStatus.OK.value())
            .build();
      return ResponseEntity.ok(response);
    }
}
