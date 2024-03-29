package com.learn.conference.service;

import com.learn.conference.model.Course;
import com.learn.conference.model.Registration;
import com.learn.conference.model.RegistrationReport;
import com.learn.conference.repository.CourseRepository;
import com.learn.conference.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;

    @Autowired
    CourseRepository courseRepository;

    @Transactional
    @Override
    public Registration saveRegistration(Registration registration){
        registration = registrationRepository.save(registration);

        /**
         * Add a Intro course mandatory for each registered user.
         **/
        Course course=new Course();
        course.setName("Intro Course");
        course.setDescription("Every Attendees should complete this course");
        course.setRegistration(registration);
        // save course
        courseRepository.saveCourse(course);
        return registration;

    }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReport> findAllReports() {
        return registrationRepository.registrationReport();
    }

}
