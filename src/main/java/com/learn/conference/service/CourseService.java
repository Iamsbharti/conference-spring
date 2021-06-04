package com.learn.conference.service;

import com.learn.conference.model.Course;

import java.util.List;

public interface CourseService {
    String updateCourse(Long id, String name);

    List<Course> findAll();
}
