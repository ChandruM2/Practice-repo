package com.example.Demo2.service;

import com.example.Demo2.model.Review;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewService {

    Map<String, Review> rp = new HashMap<>();
    public Collection<Review> reviewvalue() {

        return rp.values();

    }

    public String saveReview(String createdBy, Review review) {
        rp.put(createdBy,review);
        return "review added";
    }
}
