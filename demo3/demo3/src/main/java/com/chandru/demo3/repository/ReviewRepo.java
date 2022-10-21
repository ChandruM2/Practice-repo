package com.chandru.demo3.repository;

import com.chandru.demo3.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review,Long> {
}
