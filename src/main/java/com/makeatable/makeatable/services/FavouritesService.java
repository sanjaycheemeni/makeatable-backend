package com.makeatable.makeatable.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.makeatable.makeatable.model.Favourites;

import com.makeatable.makeatable.repository.FavouritesRepo;




@Service
public class FavouritesService {

    public final FavouritesRepo favouritesRepo;

    FavouritesService(FavouritesRepo favouritesRepo) {
        this.favouritesRepo = favouritesRepo;
    }

    // get all table values
    public List<Favourites> getAllRating() {
        return favouritesRepo.findAll();
    }

    public Favourites addRating(Favourites favourites) {
        return favouritesRepo.save(favourites);
    }

    public Favourites updateRating(Favourites favourites, Long id) {

        Optional<Favourites> optionalfav = favouritesRepo.findById(id);
        if (optionalfav.isPresent()) {
            Favourites newfav = optionalfav.get();

            newfav.setFoodid(favourites.getFoodid());
            newfav.setUsername(favourites.getUsername());

            return favouritesRepo.save(newfav);
            
        }
        return null;

    }

}