package com.chandru.demo4.repository;

import com.chandru.demo4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface UserRepo extends JpaRepository<User, Integer> {
}
