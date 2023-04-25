package com.example.newDay.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.newDay.Model.Student;
import com.example.newDay.Service.SService;
@RestController
public class SController {
	@Autowired
	public  SService ser;
	@PostMapping("/stu")
	public Student postdata(@RequestBody Student st)
	{
		return ser.postdata(st);
	}

}
