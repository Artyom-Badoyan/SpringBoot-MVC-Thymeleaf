package com.example.springmvcthymeleaf.repository;

import com.example.springmvcthymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
