package com.microservices.hotel.hotelservices.controllers;

import com.microservices.hotel.hotelservices.entity.Hotel;
import com.microservices.hotel.hotelservices.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //to create new Hotel.
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelService.saveHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    //Get All Hotels
    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> allHotels = hotelService.getAllHotel();
        return ResponseEntity.ok(allHotels);
    }

    //Get Hotels by Id
    @GetMapping("/{hotelId}")
    public  ResponseEntity<Hotel> getHotelsById(@PathVariable String hotelId){
        Hotel hotel = hotelService.getHotel(hotelId);
        return ResponseEntity.ok(hotel);
    }
}
