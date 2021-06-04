package com.learn.conference.repository;

import com.learn.conference.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseUpdateRepo extends JpaRepository<Course,Long> {
    @Modifying
    @Query("update Course c set c.name = :name where c.id = :id")
    void updateCourseName(@Param(value="id") Long id, @Param(value="name") String name);
}
/*
public interface UserRepository extends JpaRepository<User, Long> {

  @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
  User findByLastnameOrFirstname(@Param("lastname") String lastname,
                                 @Param("firstname") String firstname);
}
* **/