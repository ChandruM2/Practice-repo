package com.chandru.demo4.controller;


import com.chandru.demo4.model.User;
import com.chandru.demo4.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserContoller {

    @Autowired
    private Userservice userservice;

    @GetMapping("/users")
    public List<User> getUsers()
    {
        return userservice.get();
    }


   @PostMapping("/adduser")
    public String addUsers(@RequestBody User user)
   {
       return userservice.add(user);
   }


   @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Integer id)
   {
       return userservice.find(id);
   }

}
