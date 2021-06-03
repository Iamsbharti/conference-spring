package com.learn.conference.controller;

import com.learn.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.*;
@Controller
public class RegistrationController {
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result){
        System.out.println("New registration:"+registration.getName());
        if(result.hasErrors()){
            System.out.println("Has ERRORS");
            return "registration";
        }
        return "redirect:registration";
    }
}
