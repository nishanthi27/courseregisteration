package com.example.courseregisteration.Repository;

import com.example.courseregisteration.Model.Courseregistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courseregistryrepository extends JpaRepository<Courseregistry,Integer> {


}
