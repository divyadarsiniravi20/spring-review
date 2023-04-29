package com.example.Boutique.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;
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
	public List<Boutique> sortDetails(String name)
	{
		return boutiquerep.findAll(Sort.by(name).descending());
	}
	public List<Boutique> page(int num,int size){
		Page<Boutique> p= boutiquerep.findAll(PageRequest.of(num, size));
		return p.getContent();
	}
	public List<Boutique> sortpage(int offset,int phone,String field){
		Pageable paging=PageRequest.of(offset, phone).withSort(Sort.by(field));
		Page<Boutique> ph=boutiquerep.findAll(paging);
		
	    return ph.getContent();
	}
}
