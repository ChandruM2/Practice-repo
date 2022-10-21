package com.chandru.demo3.controller;


import com.chandru.demo3.model.SeriesInfo;
import com.chandru.demo3.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SeriesController {


 @Autowired
 private SeriesService service;


    @GetMapping("/series")
    public List<SeriesInfo> getSeries()
    {
        return service.getSeries();
    }

    @PostMapping("/addseries")
    public String addSeries(@RequestBody SeriesInfo seriesInfo)
    {
        return service.save(seriesInfo);
    }

    @GetMapping("/series/{id}")
    public Optional<SeriesInfo> search(@PathVariable long seriesid)
    {
        return service.find(seriesid);
    }
}
