package com.example.Destination.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Destination.Model.Question;

public interface AnswerRepo extends JpaRepository<Question, Integer> {



}
