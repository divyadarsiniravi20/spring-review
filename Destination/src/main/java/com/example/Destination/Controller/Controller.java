package com.example.Destination.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Destination.Model.Question;
import com.example.Destination.Repo.QuestionRepo;


@RestController
@RequestMapping("/question")
public class Controller {
	
	@Autowired
	QuestionRepo repo;
	@PostMapping("")
	public String saveDetails(@RequestBody Question q)
	{
		repo.save(q);
		return "Data is saved";
	}
	
	@GetMapping("/query")

	public List<Question> getAll()

	{
		return repo.get();
	}

	

	@GetMapping("/queryget/{qno}")
	public List<Question> getdetails(@PathVariable int qno)
	{
		return repo.getD(qno);
	}
	@PutMapping("/queryupdate/{qno}/{qname}")

	public void updateDetails(@PathVariable int qno,@PathVariable String qname)
	{
		 repo.update(qno,qname); 
	}

	@DeleteMapping("/deletequery/{qno}/{qname}")

	public String deleteDetails(@PathVariable int qno,@PathVariable String qname)

	{
		repo.deleteById(qno,qname);
		return "Deleted Successfully";
	}
	
	@GetMapping("/jpql/{qno}")
	public List<Question> get(@PathVariable int qno)
	{
		return repo.getDetails(qno);
	}
	@GetMapping("/jpql/like")
	public List<Question> getQuestion()
	{
		return repo.getH();
	}
	@GetMapping("/jqpl/between/{qno}/{qid}")
	public List<Question> getR(@PathVariable int qno,@PathVariable int qid)
	{
		return repo.getRange(qno,qid);
	}
}
	
	


