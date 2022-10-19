package com.example.Demo2.controller;


import com.example.Demo2.model.Review;
import com.example.Demo2.model.User;
import com.example.Demo2.service.ReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ReviewController {


    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }


    @GetMapping("/review")
    public Collection<Review> getReview()
    {
        return reviewService.reviewvalue();
    }

    @PostMapping("/addReview")
    public String addUser(@RequestBody Review review)
    {
        return reviewService.saveReview(review.getCreatedBy(),review);
    }
}
