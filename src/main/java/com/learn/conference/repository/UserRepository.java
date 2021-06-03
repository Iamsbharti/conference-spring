package com.learn.conference.repository;

import com.learn.conference.model.User;

public interface UserRepository {
    User save(User user);
}
