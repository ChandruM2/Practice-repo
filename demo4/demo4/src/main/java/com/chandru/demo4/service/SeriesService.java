package com.chandru.demo4.service;


import com.chandru.demo4.model.SeriesEntity;
import com.chandru.demo4.repository.SeriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepo repo;


    public List<SeriesEntity> getSeries() {
        return repo.findAll();
    }

    public String add(SeriesEntity seriesEntity) {
        repo.save(seriesEntity);
        return "series added successfully";
    }

    public Optional<SeriesEntity> findseries(Long id) {

        return repo.findById(id);
    }
}
