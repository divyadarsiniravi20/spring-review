package com.example.newDay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newDay.Model.Student;

public interface Repository extends JpaRepository<Student, Integer> {

}
