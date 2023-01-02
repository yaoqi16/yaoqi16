package io.javabrains.ragtingsdataservices.repository;

import io.javabrains.ragtingsdataservices.models.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, String> {
    Optional<Rating> findById(String movieId);
    Rating save(Rating rating);
}
