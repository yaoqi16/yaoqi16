package io.javabrains.ragtingsdataservices.controller;

import io.javabrains.ragtingsdataservices.models.Rating;
import io.javabrains.ragtingsdataservices.models.UserRating;
import io.javabrains.ragtingsdataservices.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
    @Autowired
    RatingService ratingService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public Rating saveRating(@RequestBody Rating rating){
        return ratingService.save(rating);
    }

    @RequestMapping(value = "/{movieId}", method = RequestMethod.GET)
    public ResponseEntity<Rating> getRating (@PathVariable("movieId") String movieId){
        Rating rating = ratingService.getRating(movieId);
        if(rating == null){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(rating);
        }
    }

    /*@RequestMapping(value = "/{movieId}")
    public Rating getRating (@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }*/

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public UserRating getListRatings(@PathVariable("userId") String userId){
       List<Rating> ratings = Arrays.asList(
                        new Rating("550", 4),
                        new Rating("500", 3));
       UserRating userRating = new UserRating();
       userRating.setUserRating(ratings);
       return userRating;
    }
}
