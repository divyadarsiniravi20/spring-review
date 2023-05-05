package com.example.onetomany.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
