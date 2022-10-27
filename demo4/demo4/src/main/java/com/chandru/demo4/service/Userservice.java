package com.chandru.demo4.service;


import com.chandru.demo4.model.User;
import com.chandru.demo4.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Userservice {


    @Autowired
    private UserRepo repo;

    public List<User> get()
    {
        return repo.findAll();
    }


    public String add(User user) {

       repo.save(user);
       return "added successfully";
    }

    public Optional<User> find(Integer id) {

        return repo.findById(id);
    }
}
