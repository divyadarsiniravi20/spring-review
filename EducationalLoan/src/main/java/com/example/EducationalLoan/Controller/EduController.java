package com.example.EducationalLoan.Controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.EducationalLoan.Model.LoanApplicationModel;
import com.example.EducationalLoan.Model.UserModel;
import com.example.EducationalLoan.Service.EduService;

//import io.swagger.v3.oas.annotations.tags.Tag;



@RestController

@RequestMapping("/user")

public class EduController {

	@Autowired

	public EduService ser;

	//@Tag(name = "GET ALL PATIENT DETAILS USING QUERY",description = "provides the details of requested table by query")

	@GetMapping("/ad")



    public Optional<UserModel>  readbyid(@PathVariable("id")int id)

    {

   	 return ser.getUsermodelbyId(id);

    }

	// @Tag(name = "POST PATIENT DETAILS IN THE ONE TO MANY PROJECT",description = "poat the details in the database")

	@PostMapping("/id")

    public UserModel create(@RequestBody UserModel id)

    {

   	 return ser.adduser(id);



    }

	// @Tag(name = "UPDATE PATIENT DETAILS IN THE ONE TO MANY PROJECT",description = "update the details in the database")

	 @PutMapping("/id")

     public UserModel update(@RequestBody UserModel id)
     {

    	 return ser.update(id);
     }

	// @Tag(name = "DELETE PATIENT DETAILS IN THE ONE TO MANY PROJECT",description = "delete the details in the database")

          @DeleteMapping("/delet")

     public String delete(@PathVariable("id")int id)

     {

    	 ser.delete(id);



    	 return "Deletion was successful";

     }

          

      	

      	@PostMapping("/lid")

          public LoanApplicationModel create(@RequestBody LoanApplicationModel loanId)

          {

         	 return ser.adduser(loanId);

          }

      	 @PutMapping("/lid")

           public LoanApplicationModel update(@RequestBody LoanApplicationModel loanId)

           {

          	 return ser.update(loanId);

           }

            @DeleteMapping("/delete")

           public String delete1(@PathVariable("loanId")int loanId)

           {

          	 ser.delete(loanId);

          	 return "Deletion was successful";

           }



            @GetMapping("/ladd")

            public Optional<LoanApplicationModel>  readbyid1(@PathVariable("loanId")int loanId)

            {
           	return ser.getLoanApplicationbyId(loanId);
            }

}

