package com.microservices.hotel.hotelservices.repositories;

import com.microservices.hotel.hotelservices.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {

    //Custom queries goes here.
}
