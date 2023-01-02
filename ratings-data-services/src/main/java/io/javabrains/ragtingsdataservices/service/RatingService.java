package io.javabrains.ragtingsdataservices.service;

import io.javabrains.ragtingsdataservices.models.Rating;

public interface RatingService {
    Rating getRating(String movieId);
    Rating save(Rating rating);
}
