package com.example.onetomany.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.Model.Question;
import com.example.onetomany.Repo.QuestionRepo;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionRepo qrepo;
	@PostMapping("")
	public String saveDetails (@RequestBody Question q)
	{
		qrepo .save(q);
		return "Data is saved";
	}
	

}
