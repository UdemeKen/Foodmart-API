package com.example.food.model;

import lombok.*;

import javax.persistence.*;
import java.util.Random;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double latitude;
    private Double longitude;
    private String address;

    public Location(String address){
        this.address = address;
        Random random = new Random();
        this.latitude = random.nextDouble()*90;
        this.longitude = random.nextDouble()*180;
    }
}
