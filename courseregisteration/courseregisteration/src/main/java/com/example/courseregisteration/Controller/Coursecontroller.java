package com.example.courseregisteration.Controller;

import com.example.courseregisteration.Model.Course;
import com.example.courseregisteration.Model.Courseregistry;
import com.example.courseregisteration.Service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class Coursecontroller {

    @Autowired
    Courseservice courseservice;

//    Display all available corses
    @GetMapping("courses")
    public List<Course> availablecourse(){

        return(courseservice.availablecourse());

    }
//    Get all enrolled students details
    @GetMapping("students")
    public List<Courseregistry> getenrolledstudents()
    {
        return courseservice.getenrolledstudents();
    }

// Post courseregistry details

    @PostMapping("/courseregistry/enrollcourse")
    public String enrollcourse(@RequestParam("id") int id,@RequestParam("name") String name
    ,@RequestParam("email") String email,@RequestParam("course") String course)
    {
        courseservice.enrollcourse(id,name,email,course);
        return "Congratulations "+name+" successfully enrolled in "+course + " course";
    }


//    post course details
    @PostMapping("course/details")
    public String addcourse(@RequestParam("coursename") String coursename,@RequestParam("coursetrainer")
                            String coursetrainer,@RequestParam("courseid") String courseid,
                            @RequestParam("courseduration") int courseduration)
    {
        courseservice.addcourse(coursename,coursetrainer,courseid,courseduration);
        return(coursename+" added successfully");
    }


}
