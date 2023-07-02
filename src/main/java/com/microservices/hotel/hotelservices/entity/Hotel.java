package com.microservices.hotel.hotelservices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "hotels")
public class Hotel {
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String hotelId;

    @Column(name = "NAME", length = 45)
    private String hotelName;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "ABOUT")
    private String about;
}
