package com.example.Boutique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Boutique.model.Boutique;

import com.example.Boutique.service.BoutiqueService;

@RestController
@RequestMapping("/stu")
public class BoutiqueController {
	@Autowired
	private BoutiqueService bs;
	@PostMapping("/add")
	public String add(@RequestBody Boutique student)
	{
		bs.Post(student);
		return "Successfully Added";
	}
	@PutMapping("/update")
	public String update(@RequestBody Boutique student)
	{
	bs.Update(student);
		return "Successfully Updated";
	}
	@GetMapping("/get")
	public List<Boutique> getAll()
	{
		return bs.getAll();
	}
	@DeleteMapping("/delete/{itemno}")
	public void Delete(@PathVariable int itemno)
	{
	bs.Delete(itemno);
	}
	@GetMapping("/div/{name}")
	public List<Boutique> sortDetails(@PathVariable("name")String name)
	{
		return bs.sortDetails(name);
	}
	@GetMapping("/div/{civ}/{psize}")
	public List<Boutique> page(@PathVariable("civ")int num,@PathVariable("psize")int size)
	{
		return bs.page(num, size);
	}
    @GetMapping("/div/{num}/{size}/{name}")
    public List<Boutique> sortpage(@PathVariable int num,@PathVariable int size,@PathVariable String name)
    {
    	return bs.sortpage(num, size, name);
    }
}
