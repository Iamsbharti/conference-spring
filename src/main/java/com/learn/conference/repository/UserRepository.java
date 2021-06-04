package com.learn.conference.repository;

import com.learn.conference.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    /** All the basic crud functions are already implemented **/
}
