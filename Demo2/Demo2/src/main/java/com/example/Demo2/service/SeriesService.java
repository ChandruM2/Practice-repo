package com.example.Demo2.service;

import com.example.Demo2.model.Series;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class SeriesService {

    public Map<String, Series> mpp = new HashMap<>();


    public Collection<Series> values() {
        return mpp.values();
    }

    public Series get(String id) {
        final Series series = mpp.get(id);
        if(series == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return series;
    }

    public String save(String name, Series series) {
         mpp.put(name,series);
         return "added succesfully";
    }
}
