package com.makeatable.makeatable.repository;

import com.makeatable.makeatable.model.Favourites;
import com.makeatable.makeatable.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavouritesRepo extends JpaRepository<Favourites,Long> {
}
