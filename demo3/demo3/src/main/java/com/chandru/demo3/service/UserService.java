package com.chandru.demo3.service;

import com.chandru.demo3.model.UsersInfo;
import com.chandru.demo3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired private  UserRepository repo;

    public List<UsersInfo> listall()
    {
       return (List<UsersInfo>) repo.findAll();
    }

    public String saveUser(UsersInfo user) {
        repo.save(user);
        return "User registered successfully!";
    }

    public Optional<UsersInfo> find(Integer id) {

        return repo.findById(id);
    }

}
