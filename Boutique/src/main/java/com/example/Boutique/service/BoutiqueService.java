package com.example.Boutique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Boutique.repository.BoutiqueRepository;
import ch.qos.logback.core.model.Model;
@Service
public class BoutiqueService {
	@Autowired
	private BoutiqueRepository brepo;
	public List<Model> getModel()
	{
		return brepo.findAll();
	}
	public Optional<Model> getModel(int itemNo)
	{
		return brepo.findById(itemNo);
	}
	public Model addModel(Model rt)
	{
		return brepo.save(rt);
	}
	public Model editModel(Model rcModel,int itemNo)
	{
		Model m = brepo.findById(itemNo).orElse(null);
		if(m!=null)
		{
			m.setitemNo(rcModel.getitemNo());
			return brepo.saveAndFlush(m);
		}
		else {
			{
				return null;
			}
		}
	}
	public String deleteRetdetailClass(int itemNo)
	{
		brepo.deleteById(itemNo);
		return itemNo+"Deleted";
	}

}
