package com.example.Boutique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Boutique.model.Loginmodel;
import com.example.Boutique.repository.LoginRepo;
@Service
public class Loginservice {
	@Autowired
private LoginRepo repol;
	public String checkLogin(String lname,String pwd)
	{
	Loginmodel user = repol.findBylname(lname);
	if(user==null)
	{
		return "No User Found";
	}
	else {
		if(user.getPwd().equals(pwd)){
			return "Login succesful";
		}
		else {
			return "Login Failed";
		}
	}
	}
	public Loginmodel addUser(Loginmodel mod)
	{
		return repol.save(mod);
	}
	public List<Loginmodel>getUser()
	{
		return repol.findAll();
	}
}
