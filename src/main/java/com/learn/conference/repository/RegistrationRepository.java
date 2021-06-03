package com.learn.conference.repository;

import com.learn.conference.model.Registration;
import com.learn.conference.model.RegistrationReport;

import java.util.List;

public interface RegistrationRepository {
    Registration saveRegistration(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
