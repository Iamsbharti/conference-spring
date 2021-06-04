package com.learn.conference.service;

import com.learn.conference.model.Course;
import com.learn.conference.repository.CourseRepository;
import com.learn.conference.repository.CourseUpdateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CourseUpdateRepo courseUpdateRepo;
    @Override
    @Transactional
    public String updateCourse(Long id, String name){
        System.out.println("Update course Service:"+id+"--"+name);
        courseUpdateRepo.updateCourseName(id,name);
        return "Course Updated";
    }

    @Override
    @Transactional
    public List<Course> findAll() {
        return courseRepository.findAll();
    }
}
