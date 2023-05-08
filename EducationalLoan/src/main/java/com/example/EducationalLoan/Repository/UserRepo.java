package com.example.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
