package com.microservices.rating.RatingService.repository;

import com.microservices.rating.RatingService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {

    //custom queries can come here.

    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);
}
