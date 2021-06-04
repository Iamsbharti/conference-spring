package com.learn.conference.service;

import com.learn.conference.model.User;
import com.learn.conference.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long id, User user) {
        // find existing id
        User userExists = userRepository.findById(id).get();
        System.out.println("User Exists-before update::"+userExists.getFirstName());
        // update

        if (user.getFirstName() != null) {
            userExists.firstName = user.getFirstName();
        }
        if(user.getLastName()!= null){
            userExists.lastName=user.getLastName();
        }
        if(user.getAge() != 0){
            userExists.age=user.getAge();
        }
        userRepository.save(userExists);
        return userExists;
    }
}
