package com.chandru.demo3.repository;

import com.chandru.demo3.model.SeriesInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepo extends JpaRepository<SeriesInfo,Integer> {
}
