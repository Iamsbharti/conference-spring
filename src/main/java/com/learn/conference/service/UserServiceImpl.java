package com.learn.conference.service;

import com.learn.conference.model.User;
import com.learn.conference.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    @Transactional
    public User save(User user){
        System.out.println("In User Service Impl");
       return userRepository.save(user);
    }
}
