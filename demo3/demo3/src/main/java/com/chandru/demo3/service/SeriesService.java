package com.chandru.demo3.service;


import com.chandru.demo3.model.SeriesInfo;
import com.chandru.demo3.model.UsersInfo;
import com.chandru.demo3.repository.SeriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepo repo;


    public List<SeriesInfo> getSeries() {

        return repo.findAll();
    }

    public String save(SeriesInfo seriesInfo) {

        repo.save(seriesInfo);
        return "series added ";

    }
    public Optional<SeriesInfo> findseries(Integer id) {

        return repo.findById(id);
    }
}
