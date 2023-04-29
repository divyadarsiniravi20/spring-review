package com.example.Boutique.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Boutique.model.Loginmodel;

public interface LoginRepo extends JpaRepository<Loginmodel, Integer> {
	Loginmodel findBylname(String lname);

}
