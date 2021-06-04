package com.learn.conference.repository;

import com.learn.conference.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**Switched to JPARepository -> spring-data **/
/**
 * @Repository
 * public class UserRepositoryImpl implements UserRepository {
 *     @PersistenceContext
 *     private EntityManager entityManager;
 *     @Override
 *     public User save(User user){
 *         System.out.println("Saving User With EntityManager in Repository");
 *         entityManager.persist(user);
 *         return user;
 *     }
 * }
 * **/
/*** Ignore this placeholder */
public class UserRepositoryImpl{
    @PersistenceContext
    private EntityManager entityManager;
    public User save(User user){
        System.out.println("Saving User With EntityManager in Repository");
        entityManager.persist(user);
        return user;
    }
}