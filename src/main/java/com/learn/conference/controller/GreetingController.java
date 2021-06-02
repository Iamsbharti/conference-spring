package com.learn.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("greeting")
    public String greeting(Map<String,Object> model){
        model.put("message","Hello from controller");
        return "greeting"; // returns jsp page with this name
    }
    @GetMapping("ping")
    public String pingFunction(Map<String,Object> model){
        model.put("pingReply","PING SUCCESS 6767ms");
        return "ping";
    }
}
