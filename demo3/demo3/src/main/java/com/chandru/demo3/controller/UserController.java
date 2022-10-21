package com.chandru.demo3.controller;

import com.chandru.demo3.model.UsersInfo;
import com.chandru.demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired private  UserService ser;


    @GetMapping("/users")
    public List<UsersInfo> showUsersList()
    {
       return ser.listall();

    }

    @PostMapping("/adduser")
    public String add(@RequestBody UsersInfo user) {
        return ser.saveUser(user);

    }




}
