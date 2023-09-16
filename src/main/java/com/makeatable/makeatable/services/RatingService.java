package com.makeatable.makeatable.services;

import com.makeatable.makeatable.model.*;

import java.util.List;
import java.util.Optional;


import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import com.makeatable.makeatable.repository.RatingRepo;

@Service
@Slf4j
public class RatingService {

    public final RatingRepo ratingRepo;

    RatingService(RatingRepo ratingRepo) {
        this.ratingRepo = ratingRepo;
    }

    // get all table values
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }

    public Rating addRating(Rating rating) {
        return ratingRepo.save(rating);
    }

    public Rating updateRating(Rating rating, Long id) {

        Optional<Rating> optionalRating = ratingRepo.findById(id);
        if (optionalRating.isPresent()) {

            Rating newRating = optionalRating.get();
            newRating.setFood_id(rating.getFood_id());
            newRating.setUsername(rating.getUsername());
            newRating.setValue(rating.getValue());
            return ratingRepo.save(newRating);
        }
        return null;

    }

}
