package com.microservices.rating.service.RatingService.impl;

import com.microservices.rating.service.RatingService.api.RatingService;
import com.microservices.rating.service.RatingService.entities.Rating;
import com.microservices.rating.service.RatingService.respository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService
{
    @Autowired
    RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating)
    {
        return ratingRepository.insert(rating);
    }

    @Override
    public List<Rating> allRatings()
    {
        return ratingRepository.findAll();
    }
 
    @Override
    public List<Rating> getRatingsByUser(Long userId)
    {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingbyHotel(Long hotelId)
    {
        return null;
    }
}
