package com.microservices.hotel.hotelservices.services;

import com.microservices.hotel.hotelservices.entity.Hotel;

import java.util.List;
public interface HotelService {

    //create
    Hotel saveHotel(Hotel hotel) ;

    //Get All Hotel
    List<Hotel> getAllHotel();

    //Get Hotel by Id
    Hotel getHotel(String hotelId);

}
