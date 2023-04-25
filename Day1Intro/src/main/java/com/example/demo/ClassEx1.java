package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassEx1 {
	@GetMapping("/Welcome")
	@ResponseBody
	
	public String Welcome()
	{
		return "Welcome to RestApi class";
	}
	

}
