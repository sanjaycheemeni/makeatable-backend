package com.makeatable.makeatable.services;

import com.makeatable.makeatable.model.*;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.makeatable.makeatable.repository.RatingRepo;
import org.springframework.web.bind.annotation.PathVariable;

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


    public Double getRating(@PathVariable String food_id){
//            List<Rating> rating = ratingRepo.findByFoodId(food_id);
//
//            if (rating.isEmpty()) {
//                return 0.0;
//            }
//
//            float sum = 0.0f;
//            for (Rating rate : rating) {
//                sum += rate.getValue();
//            }
//
//            return (double) (sum / rating.size());

        return  0.0;

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
