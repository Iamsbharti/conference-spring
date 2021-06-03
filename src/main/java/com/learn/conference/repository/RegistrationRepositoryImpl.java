package com.learn.conference.repository;

import com.learn.conference.model.Registration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public Registration saveRegistration(Registration registration){
        entityManager.persist(registration);
        return registration;
    }
}
