package com.chandru.demo4.controller;


import com.chandru.demo4.model.SeriesEntity;
import com.chandru.demo4.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SeriesController {

    @Autowired
    private SeriesService service;

    @GetMapping("/series")
    public List<SeriesEntity> getSeries()
    {
        return service.getSeries();
    }

    @PostMapping("/addseries")
    public String addSeries(@RequestBody SeriesEntity seriesEntity)
    {
        return service.add(seriesEntity);
    }

    @GetMapping("series/{id}")
    public Optional<SeriesEntity> getUser(@PathVariable Long id)
    {
        return service.findseries(id);
    }
}
