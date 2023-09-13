package com.makeatable.makeatable.repository;

import com.makeatable.makeatable.model.Rating;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating,Long> {
}
