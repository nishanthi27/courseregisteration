package com.example.courseregisteration.Repository;

import com.example.courseregisteration.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courserepository extends JpaRepository<Course,String> {

}
