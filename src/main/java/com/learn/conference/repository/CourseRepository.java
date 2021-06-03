package com.learn.conference.repository;

import com.learn.conference.model.Course;

public interface CourseRepository {
    Course saveCourse(Course course);
}
