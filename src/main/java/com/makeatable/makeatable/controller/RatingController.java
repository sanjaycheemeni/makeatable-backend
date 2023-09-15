package com.makeatable.makeatable.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.makeatable.makeatable.model.Rating;
import com.makeatable.makeatable.services.RatingService;
import com.makeatable.makeatable.util.Response;

import static java.time.LocalDateTime.now;
import static java.util.Map.*;
import static org.springframework.http.HttpStatus.OK;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/rating")
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;
    @GetMapping("/{id}")public ResponseEntity<Response> getrating(@PathVariable Long id){

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Ratings", ratingService.getAllRating()))
                        .message("list of all ratings")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());
    }
    @GetMapping("/list")
    public ResponseEntity<Response> getaAllRatings() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Ratings", ratingService.getAllRating()))
                        .message("list of all ratings")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Response> addRating(@RequestBody Rating rating) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Added rating", ratingService.addRating(rating)))
                        .message("Rating added")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()

        );
    }

    @PutMapping
    public ResponseEntity<Response> updateRating(@RequestBody Rating rating, @PathVariable("id") Long id) {
        // System.out.println(food);
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Updated Rating ", ratingService.updateRating(rating, id)))
                        .message("rating updated")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()

        );
    }
}
