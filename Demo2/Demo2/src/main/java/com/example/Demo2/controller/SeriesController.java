package com.example.Demo2.controller;


import com.example.Demo2.model.Series;
import com.example.Demo2.service.SeriesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@RestController
public class SeriesController {

    private final SeriesService service;

    public SeriesController(SeriesService service) {
        this.service = service;
    }

    @GetMapping("/series")
    public Collection<Series> getSeries()
    {
        return service.values();
    }


    @GetMapping("/findSeries/{id}")
    public Series findSeriesByName(@PathVariable String id)
    {
        return service.get(id);
    }


    @PostMapping("/addSeries")
    public String addSeries(@RequestBody Series series)
    {
        return service.save(series.getName(),series);
    }
}
