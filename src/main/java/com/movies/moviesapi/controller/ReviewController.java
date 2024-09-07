package com.movies.moviesapi.controller;

import com.movies.moviesapi.model.Review;
import com.movies.moviesapi.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody  Map<String, String> payload){
        String reviewBody = payload.get("reviewBody");
        String reviewIds = payload.get("reviewIds");

        // Create the review using the service
        Review createdReview = reviewService.createReview(reviewBody, reviewIds);

        return new ResponseEntity<>(createdReview, HttpStatus.CREATED);
    }
}
