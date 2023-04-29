package com.example.Boutique.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Boutique.model.Boutique;
@Repository
public interface BoutiqueRep extends JpaRepository<Boutique, Integer> {
	
	
	 
    
}
