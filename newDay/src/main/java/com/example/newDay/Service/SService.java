package com.example.newDay.Service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.newDay.Model.Student;

public class SService {
	public Repository repo;

	public Student postdata(Student st) {
		// TODO Auto-generated method stub
		return repo.save(st);
	}

	public Student postdata(Student st) {
		// TODO Auto-generated method stub
		return null;
	}

}
