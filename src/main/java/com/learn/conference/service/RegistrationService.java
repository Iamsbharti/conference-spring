package com.learn.conference.service;

import com.learn.conference.model.Registration;
import com.learn.conference.model.RegistrationReport;

import javax.transaction.Transactional;
import java.util.List;

public interface RegistrationService {
    Registration saveRegistration(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
