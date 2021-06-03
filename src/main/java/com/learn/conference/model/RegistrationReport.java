package com.learn.conference.model;

public class RegistrationReport {
    private String name;

    public RegistrationReport(String name, String courseName, String courseDesc) {
        this.name = name;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
    }

    private String courseName;
    private String courseDesc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
}
