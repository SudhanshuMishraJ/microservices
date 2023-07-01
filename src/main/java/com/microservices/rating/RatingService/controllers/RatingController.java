package com.microservices.rating.RatingService.controllers;

import com.microservices.rating.RatingService.entities.Rating;
import com.microservices.rating.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //create rating
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating){

        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    //Get All ratings
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){

        return  ResponseEntity.ok(ratingService.getAllRating());
    }

    //Get Rating by UserId
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){

        return  ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    //Get Rating by UserId
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){

        return  ResponseEntity.ok(ratingService.getRatingByUserId(hotelId));
    }
}
