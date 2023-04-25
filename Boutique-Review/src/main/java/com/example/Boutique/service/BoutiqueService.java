package com.example.Boutique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Boutique.model.Boutique;
import com.example.Boutique.repository.BoutiqueRep;
@Service
public class BoutiqueService {
	@Autowired
	private BoutiqueRep boutiquerep;
	public Boutique Post(Boutique student)
	{
		return boutiquerep.save(student);
	}
	public List<Boutique> getAll()
	{
		return boutiquerep.findAll();	
	}
	public Boutique Update(Boutique student)
	{
		return boutiquerep.save(student);
	}
	public void Delete(int itemno)
	{
		boutiquerep.deleteById(itemno);
	}
}
