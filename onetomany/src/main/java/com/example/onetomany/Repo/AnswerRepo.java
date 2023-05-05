package com.example.onetomany.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.Model.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Integer> {

}
