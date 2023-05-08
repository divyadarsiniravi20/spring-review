package com.example.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoan.Model.LoanApplicationModel;

@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
