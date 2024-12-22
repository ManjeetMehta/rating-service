package com.microservices.rating.service.RatingService.api;

import com.microservices.rating.service.RatingService.entities.Rating;

import java.util.List;

public interface RatingService
{
    Rating create(Rating rating);

    List<Rating> allRatings();

    List<Rating> getRatingsByUser(Long userId);

    List<Rating> getRatingbyHotel(Long hotelId);
}
