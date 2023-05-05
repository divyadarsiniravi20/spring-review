package com.example.Boutique.controller;

import java.util.List;
import io.swagger.v3.oas.annotations.tags.Tag;
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
import com.example.Boutique.repository.BoutiqueRep;
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
	@PutMapping("/update/{itemno}")
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
    @Autowired
	public BoutiqueRep repo;
	@Tag(name="Get Query" ,description=" getting all using native query")
	
	@GetMapping("/query")
	public List<Boutique> getAll1()
	{
		return repo.get();
	}
	
	@Tag(name="Get QuerybyId" ,description=" getting details by Id using native query")
	@GetMapping("/queryget/{itemNo}")
	public List<Boutique> getdetails(@PathVariable int itemNo)
	{
		return repo.getD(itemNo);
	}
	
	
	@Tag(name="Update QuerybyId" ,description=" updating id using native query")
	@PutMapping("/queryupdate/{itemNo}/{name}")
	public void updateDetails(@PathVariable int itemNo,@PathVariable String name)
	{
		 repo.update(itemNo,name); 
	}
	
	
	@Tag(name="Delete QuerybyId and Name" ,description=" deleting details by Id and Name using native query")
	@DeleteMapping("/deletequery/{itemNo}/{name}")
	public String deleteDetails(@PathVariable int itemNo,@PathVariable String name)
	{
		
		repo.deleteById(itemNo,name);
		return "Deleted Successfully";
	}
	
	@Tag(name="Delete QuerybyId" ,description=" deleting details by Id using native query")
	@DeleteMapping("/delete/{itemNo}")
	public String deleteD(@PathVariable int itemNo)
	{
		
		repo.delete(itemNo);
		return "Deleted Successfully";
	}
	
	

	
	//jpql
	
	@Tag(name="Get JPQLQuerybyId" ,description=" getting details by Id using JPQL query")
	@GetMapping("/jpql/{itemNo}")
	public List<Boutique> get(@PathVariable int itemNo)
	{
		return repo.getDetails(itemNo);
	}
	
	
	@Tag(name="Get JPQLQuery using like" ,description=" getting details by like using JPQL query")
	@GetMapping("/jpql/like")
	public List<Boutique> getHFirms()
	{
		return repo.getH();
	}
	
	
	
	@Tag(name="Get JPQLQuery Between" ,description=" getting details between ranges  using JPQL query")
	@GetMapping("/jqpl/between/{itemNo}/{sizes}")
	public List<Boutique> getR(@PathVariable int itemNo,@PathVariable int sizes)
	{
		return repo.getRange(itemNo,sizes);
	}
	
	
	
	@GetMapping("/jqpl/in")
	public List<Boutique> getDetails()
	{
		return repo.getD();
	}
}
