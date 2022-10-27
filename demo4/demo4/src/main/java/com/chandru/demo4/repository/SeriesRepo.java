package com.chandru.demo4.repository;

import com.chandru.demo4.model.SeriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepo extends JpaRepository<SeriesEntity,Long> {
}
