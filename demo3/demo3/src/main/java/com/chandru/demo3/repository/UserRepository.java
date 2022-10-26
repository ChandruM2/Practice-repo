package com.chandru.demo3.repository;

import com.chandru.demo3.model.UsersInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UsersInfo, Integer> {

}
