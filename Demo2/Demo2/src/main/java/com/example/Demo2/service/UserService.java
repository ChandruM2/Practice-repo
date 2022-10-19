package com.example.Demo2.service;

import com.example.Demo2.model.Series;
import com.example.Demo2.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    public Map<String, User> mp = new HashMap<>();

    public Collection<User> uservalues() {
        return mp.values();
    }

    public String saveUser(String userName, User user) {
        mp.put(userName,user);
        return "added succesfully";
    }
}
