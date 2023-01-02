package io.javabrains.ragtingsdataservices.service;

import io.javabrains.ragtingsdataservices.models.Rating;
import io.javabrains.ragtingsdataservices.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    RatingRepository ratingRepository;

    @Override
    public Rating getRating(String movieId) {
        Optional<Rating> rating1 = ratingRepository.findById(movieId);
        if(rating1.isPresent()){
            return rating1.get();
        }
        return null;
    }

    @Override
    public Rating save(Rating rating) {
        Optional<Rating> rating1 = Optional.ofNullable(ratingRepository.save(rating));
        if(rating1.isPresent()){
            return rating1.get();
        }
        return null;
    }

    /*public Rating fetchRatingById(String movieId) {
        Optional<Rating> rating = Optional.ofNullable(ratingRepository.fetchById(movieId));
        if (rating.isPresent()) {
            return rating.get();
        }
        return null;
    }*/
}
