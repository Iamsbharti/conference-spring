package com.learn.conference.repository;

import com.learn.conference.model.Registration;
import com.learn.conference.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
/**
 * @Repository
 * public class RegistrationRepositoryImpl implements RegistrationRepository {
 *     @PersistenceContext
 *     EntityManager entityManager;
 *     @Override
 *     public Registration saveRegistration(Registration registration){
 *         entityManager.persist(registration);
 *         return registration;
 *     }
 *
 *     @Override
 *     public List<Registration> findAll() {
 *         List<Registration> registrations = entityManager.createQuery("select r from Registration r").getResultList();
 *         return registrations;
 *     }
 *     /**
 *      * @Override
 *      *     public List<RegistrationReport> findAllReports() {
 *      *         String reportQuery= "select new com.learn.conference.model.RegistrationReport" +
 *      *                             "(r.name,c.name,c.description) "+
 *      *                             "from Registration r, Course c "+
 *      *                             "where r.id = c.registration.id";
 *      *         List <RegistrationReport> registrationReports = entityManager.createQuery(reportQuery).getResultList();
 *      *         return registrationReports;
 *      *     }
 *      * **/
    /**
 *@Override
 *public List<RegistrationReport> findAllReports(){
        *List<RegistrationReport> registrationReports=
        *entityManager.createNamedQuery(Registration.REGISTRATION_REPORT).getResultList();
        *return registrationReports;
        *}
        *
        *}
 * **/
public class RegistrationRepositoryImpl {
}