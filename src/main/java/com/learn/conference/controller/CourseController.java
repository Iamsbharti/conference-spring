package com.learn.conference.controller;


import com.learn.conference.model.Course;
import com.learn.conference.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    @ResponseBody
    public List <Course> getAllCourses(){
        System.out.println("Get all courses control");
        return courseService.findAll();
    }

    @PostMapping("/courses/update")
    @ResponseBody
    public String updateCourse(@PathParam(value = "id")Long id ,
                               @PathParam(value="name") String name){
        System.out.println("Update Course control::"+id+"--"+name);
        return courseService.updateCourse(id,name);
    }
}
