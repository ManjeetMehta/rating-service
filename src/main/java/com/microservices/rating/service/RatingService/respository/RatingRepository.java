package com.microservices.rating.service.RatingService.respository;

import com.microservices.rating.service.RatingService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepository extends MongoRepository<Rating, Long>
{
}
