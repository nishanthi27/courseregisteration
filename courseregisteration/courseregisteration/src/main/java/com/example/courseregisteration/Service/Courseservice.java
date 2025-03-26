package com.example.courseregisteration.Service;

import com.example.courseregisteration.Model.Course;
import com.example.courseregisteration.Model.Courseregistry;
import com.example.courseregisteration.Repository.Courseregistryrepository;
import com.example.courseregisteration.Repository.Courserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class Courseservice {
    @Autowired
    Courserepository courserepository;
    @Autowired
    Courseregistryrepository courseregistryrepository;
    public List<Course> availablecourse() {
    return courserepository.findAll();
    }

    public List<Courseregistry> getenrolledstudents() {
        return courseregistryrepository.findAll();

    }

    public void enrollcourse(int id, String name, String email, String course) {
    Courseregistry courseregistry=new Courseregistry(id,name,email,course);
    courseregistryrepository.save(courseregistry);

    }

    public void addcourse(String coursename, String coursetrainer, String courseid, int courseduration) {
        Course course=new Course(coursename,coursetrainer,courseid,courseduration);
        courserepository.save(course);


    }
}
