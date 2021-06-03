package com.learn.conference.service;

import com.learn.conference.model.Registration;

import javax.transaction.Transactional;

public interface RegistrationService {
    Registration saveRegistration(Registration registration);
}
