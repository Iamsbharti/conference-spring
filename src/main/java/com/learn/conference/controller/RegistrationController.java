package com.learn.conference.controller;

import com.learn.conference.model.Registration;
import com.learn.conference.model.RegistrationReport;
import com.learn.conference.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.*;
import java.util.List;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration){
        return "registration";
    }

    @GetMapping("registrations")
    @ResponseBody
    public List<Registration> getRegistrations(){
        return registrationService.findAll();
    }

    @GetMapping("registration-report")
    @ResponseBody
    public List<RegistrationReport> getRegistrationReport(){
        return registrationService.findAllReports();
    }


    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result){
        System.out.println("New registration:"+registration.getName());
        if(result.hasErrors()){
            System.out.println("Has ERRORS");
            return "registration";
        }else{
            System.out.println("NO ERRORS- Saving Registration::"+registration.getName());
            registrationService.saveRegistration(registration);
        }
        return "redirect:registration";
    }
}
