package com.learn.conference.repository;

import com.learn.conference.model.Registration;

public interface RegistrationRepository {
    Registration saveRegistration(Registration registration);
}
