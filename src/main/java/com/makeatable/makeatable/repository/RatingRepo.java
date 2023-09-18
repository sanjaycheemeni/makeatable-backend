package com.makeatable.makeatable.repository;

import com.makeatable.makeatable.model.Food;
import com.makeatable.makeatable.model.Rating;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating,Long> {
//    List<Rating> findByFoodId(String foodId);

    @Query("SELECT r.food_id, AVG(r.value) as avgValue " +
            "FROM Rating r " +
            "GROUP BY r.food_id " +
            "ORDER BY avgValue DESC " +
            "LIMIT 5")
    List<Object[]> findTop5FoodIdsByAverageValue();
}
