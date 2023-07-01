package com.microservices.rating.RatingService.services;

import com.microservices.rating.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {


    //create new rating
    Rating create(Rating rating);

    //Get all ratings
    List<Rating> getAllRating();

    //Get Rating by userId
    List<Rating> getRatingByUserId(String userId);

    //Get Rating by hotelId
    List<Rating> getRatingByHotelId(String hotelId);
}
