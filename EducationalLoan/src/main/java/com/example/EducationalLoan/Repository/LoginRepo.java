package com.example.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
