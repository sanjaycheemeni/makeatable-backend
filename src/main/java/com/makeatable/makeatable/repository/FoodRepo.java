package com.makeatable.makeatable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.makeatable.makeatable.model.Food;

public interface FoodRepo  extends JpaRepository<Food,Long>{
    
}
