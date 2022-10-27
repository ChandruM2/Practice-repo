package com.chandru.demo4.repository;

import com.chandru.demo4.model.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<ReviewEntity,Long> {
}
