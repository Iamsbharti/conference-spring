package com.learn.conference.repository;

import com.learn.conference.model.Registration;
import com.learn.conference.model.RegistrationReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Long> {
    List<RegistrationReport> registrationReport();
}
