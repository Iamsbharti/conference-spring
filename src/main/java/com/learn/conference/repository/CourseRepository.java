package com.learn.conference.repository;

import com.learn.conference.model.Course;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository {
    Course saveCourse(Course course);
    List<Course> findAll();
}
