package com.makeatable.makeatable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import com.makeatable.makeatable.model.Food;

import java.util.List;

public interface FoodRepo  extends JpaRepository<Food,Long>{

    @Query("SELECT f.food_name, m.resto_name, m.loc_name, AVG(r.value) AS avgRating " +
            "FROM Food f " +
            "JOIN Manager m ON f.resto_id = m.resto_id " +
            "LEFT JOIN Rating r ON f.food_id = r.food_id " +
            "GROUP BY f.food_name, m.resto_name, m.loc_name " +
            "ORDER BY avgRating DESC")
    List<Object[]> findTop5FoodDetailsWithAvgRating();
    
}
