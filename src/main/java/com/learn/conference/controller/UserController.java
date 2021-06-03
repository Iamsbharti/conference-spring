package com.learn.conference.controller;

import com.learn.conference.model.User;
import com.learn.conference.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam(value="firstname",defaultValue = "Saurabh") String firstname,
                        @RequestParam(value="lastname",defaultValue = "bharti") String lastname,
                        @RequestParam(value="age",defaultValue = "26") int age
                        ){
            User user = new User();
            user.setFirstName(firstname);
            user.setLastName(lastname);
            user.setAge(age);
            return user;
    }

    @PostMapping("/user")
    public User saveUser(User user){
        System.out.println("user-control::"+user.getFirstName());
        userService.save(user);
        return user;
    }
}
