package com.microservices.rating.service.RatingService.controller;

import com.microservices.rating.service.RatingService.api.RatingService;
import com.microservices.rating.service.RatingService.entities.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController
{
    @Autowired
    RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings()
    {
        return ResponseEntity.ok(ratingService.allRatings());
    }

    @GetMapping("/users/userId")
    public ResponseEntity<List<Rating>> getRatingbyUserId(@PathVariable Long userId)
    {
        return ResponseEntity.ok(ratingService.getRatingsByUser(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingbyHotelId(@PathVariable Long hotelId)
    {
        return ResponseEntity.ok(ratingService.getRatingbyHotel(hotelId));
    }
}
