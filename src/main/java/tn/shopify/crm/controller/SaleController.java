package tn.shopify.crm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.shopify.crm.model.Sale;
import tn.shopify.crm.service.SaleService;


@RestController
@CrossOrigin(origins = "*")

public class SaleController {

	//Attire the ArticlesService class  
	@Autowired  
	SaleService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Sale")

	private List<Sale> getAllSales()   
	{  
		return cs.getAllCategories();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Sale/{id}")  
	private Sale getSales(@PathVariable("id") int id)   
	{  
		return cs.getSalesById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Sale/{id}")  
	private void deleteSale(@PathVariable("id") int id)   
	{  
		cs.delete(id);  
	} 

	@PostMapping("/Sale")  
	private int saveSale(@RequestBody Sale c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Sale")  
	private Sale update(@RequestBody  Sale c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}