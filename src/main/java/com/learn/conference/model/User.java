package com.learn.conference.model;

import javax.persistence.*;

@Entity
@Table(name = "CONF_USERS")
public class User {
    @Id
    @GeneratedValue

    private long id;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name="FIRST_NAME")
    public String firstName;

    @Column(name="LAST_NAME")
    public String lastName;

    public int age;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
