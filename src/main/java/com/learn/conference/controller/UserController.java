package com.learn.conference.controller;

import com.learn.conference.model.User;
import com.learn.conference.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public List<User> getUser(@RequestParam(value="firstname",defaultValue = "Saurabh") String firstname,
                              @RequestParam(value="lastname",defaultValue = "bharti") String lastname,
                              @RequestParam(value="age",defaultValue = "26") int age
                        ){
        /**
         *  User user = new User();
         *             user.setFirstName(firstname);
         *             user.setLastName(lastname);
         *             user.setAge(age);
         *             return user;
         * */
        return userService.findAll();

    }

    @PostMapping("/user")
    public User saveUser(User user){
        System.out.println("user-control::"+user.getFirstName());
        userService.save(user);
        return user;
    }

    @PutMapping("/user/update")
    @ResponseBody
    public User updateUser(@RequestParam(value="id" ,required=true)Long id,
                           @RequestBody User user){
        System.out.println("USER UPDATE CONTROL::"+id);
        System.out.println("USER BODY::"+user.getFirstName());

        return userService.updateUser(id,user);
    }
}
