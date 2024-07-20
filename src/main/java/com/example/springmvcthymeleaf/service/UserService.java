package com.example.springmvcthymeleaf.service;

import com.example.springmvcthymeleaf.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long id);

    void saveUser(User user);

    void deleteUserById(Long id);
}
