package com.example.Demo2.controller;

import com.example.Demo2.model.Series;
import com.example.Demo2.model.User;
import com.example.Demo2.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {

    private final UserService userservice;

    public UserController(UserService userservice) {
        this.userservice = userservice;
    }


    @GetMapping("/users")
    public Collection<User> getUser()
    {
        return userservice.uservalues();
    }

    @PostMapping("/addUsers")
    public String addUser(@RequestBody User user)
    {
        return userservice.saveUser(user.getUserName(),user);
    }
}
