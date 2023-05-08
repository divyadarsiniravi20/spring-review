package com.example.Boutique.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Ques {
	
	
	@Id
	private int qid;
	private String qname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@Join
	
	private List<Ques> product;

}
