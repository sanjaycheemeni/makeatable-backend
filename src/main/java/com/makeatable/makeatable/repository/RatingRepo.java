package com.makeatable.makeatable.repository;

import com.makeatable.makeatable.model.Food;
import com.makeatable.makeatable.model.Rating;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating,Long> {
//    List<Rating> findByFoodId(String foodId);
}
