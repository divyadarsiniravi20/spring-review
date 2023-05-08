package com.example.EducationalLoan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EducationalLoan.Model.LoanApplicationModel;
import com.example.EducationalLoan.Model.UserModel;
import com.example.EducationalLoan.Repository.AdminRepo;
import com.example.EducationalLoan.Repository.LoanApplicationRepo;


@Service
public class EduService
{
	@Autowired
	AdminRepo arepo;
	
	//get 
		public List<UserModel> getAdmin()
		{
			return arepo.findAll();
		}
		
		//post 
		public String postAdmin(UserModel am)
		{
			arepo.save(am);
			return "Data is Saved in Admin Table";
		}
		
		//delete
		public String deleteAdmin(int adminId)
		{
			arepo.deleteById(adminId);
			return "Deleted in Admin Model";
		}
		
		//update
		public  String updateAdmin(UserModel am)
		{
			arepo.saveAndFlush(am);
			return "Data Updated in AdminModel";
		}
		
		
// loanapplication
		
		@Autowired
		LoanApplicationRepo arepo1;
		
		public List<LoanApplicationModel > getAdmin1()
		{
			return arepo1.findAll();
		}
		
		//post 
		public String postAdmin(LoanApplicationModel  am)
		{
			arepo1.save(am);
			return "Data is Saved in Admin Table";
		}
		
		//delete
		public String deleteAdmin1(int adminId)
		{
			arepo1.deleteById(adminId);
			return "Deleted in Admin Model";
		}
		
		//update
		public  String updateAdmin(LoanApplicationModel  am)
		{
			arepo1.saveAndFlush(am);
			return "Data Updated in AdminModel";
		}
		
		
	
}