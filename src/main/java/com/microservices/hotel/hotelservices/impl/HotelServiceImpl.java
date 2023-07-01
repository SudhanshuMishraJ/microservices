package com.microservices.hotel.hotelservices.impl;

import com.microservices.hotel.hotelservices.entity.Hotel;
import com.microservices.hotel.hotelservices.exceptions.ResourceNotFoundException;
import com.microservices.hotel.hotelservices.repositories.HotelRepository;
import com.microservices.hotel.hotelservices.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    //Create Hotel
    @Override
    public Hotel saveHotel(Hotel hotel){
        String randomHotelId = UUID.randomUUID().toString();
        hotel.setHotelId(randomHotelId);
        return hotelRepository.save(hotel);
    }

    //Get All hotel details
    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    //Get hotel by Id
    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).
                orElseThrow(() -> new ResourceNotFoundException("Resource not found by ID"+hotelId));
    }

}
