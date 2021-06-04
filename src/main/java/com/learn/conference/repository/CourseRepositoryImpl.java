package com.learn.conference.repository;


import com.learn.conference.model.Course;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CourseRepositoryImpl implements CourseRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Course saveCourse(Course course){
        entityManager.persist(course);
        return course;
    }
    @Override
    public List<Course> findAll() {
        List<Course> courseList= entityManager.createQuery("select c from Course c").getResultList();
        return courseList;
    }
}
