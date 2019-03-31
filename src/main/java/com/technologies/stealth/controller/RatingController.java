/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technologies.stealth.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.technologies.stealth.model.Rating;
import com.technologies.stealth.model.UserRating;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Chux
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingController {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId)
    {
        return new Rating(movieId, 4);
    }
    
    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId)
    {
        List<Rating> ratings = Arrays.asList(
                new Rating("1", 4),
                new Rating("2", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRatings(ratings);
        return userRating;
    }
}
