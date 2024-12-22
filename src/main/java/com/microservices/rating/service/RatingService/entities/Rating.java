package com.microservices.rating.service.RatingService.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("rating")
public class Rating
{
    @Id
    private Long id;

    private Long userId;

    private Long hotelId;

    private int rating;

    private String feedback;
}
