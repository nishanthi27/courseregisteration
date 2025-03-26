package com.example.courseregisteration.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    private String coursename;
    private String coursetrainer;
    @Id
    private String courseid;
    private int courseduration;
    public Course(){}

    public Course(String coursename, String coursetrainer, String courseid, int courseduration) {
        this.coursename = coursename;
        this.coursetrainer = coursetrainer;
        this.courseid = courseid;
        this.courseduration = courseduration;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursetrainer() {
        return coursetrainer;
    }

    public void setCoursetrainer(String coursetrainer) {
        this.coursetrainer = coursetrainer;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public int getCourseduration() {
        return courseduration;
    }

    public void setCourseduration(int courseduration) {
        this.courseduration = courseduration;
    }
}
