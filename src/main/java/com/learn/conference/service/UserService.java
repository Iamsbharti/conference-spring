package com.learn.conference.service;

import com.learn.conference.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();

    User updateUser(Long id, User user);
}
