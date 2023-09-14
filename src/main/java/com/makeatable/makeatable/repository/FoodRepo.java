package com.makeatable.makeatable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

import com.makeatable.makeatable.model.Food;

public interface FoodRepo  extends JpaRepository<Food,Long>{

    
    
}
