package com.example.Boutique.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Boutique.model.Loginmodel;
import com.example.Boutique.service.Loginservice;
@RestController
@RequestMapping("/run")

public class LoginController {
	@Autowired
	private Loginservice service;
	@PostMapping("/login")
	public  String login(@RequestBody Map<String,String> loginData)
	{
		String lname =loginData.get("lname");
		String pwd=loginData.get("pwd");
		String result =service.checkLogin(lname,pwd);
		return result;
	}
	@PostMapping("/adduser")
	public Loginmodel AddUser(@RequestBody Loginmodel log)
	{
		return service.addUser(log);
	}
	@GetMapping
	public List<Loginmodel> listAll(){
		return service.getUser();
	}
	

}
