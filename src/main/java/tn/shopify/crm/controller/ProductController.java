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

import tn.shopify.crm.model.Product;
import tn.shopify.crm.service.ProductService;



@RestController
@CrossOrigin(origins = "*")

public class ProductController {

	//Attire the ArticlesService class  
	@Autowired  
	ProductService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Product")

	private List<Product> getAllProducts()   
	{  
		return cs.getAllCategories();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Product/{id}")  
	private Product getProducts(@PathVariable("id") int id)   
	{  
		return cs.getProductsById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Product/{id}")  
	private void deleteProduct(@PathVariable("id") int id)   
	{  
		cs.delete(id);  
	} 

	@PostMapping("/Product")  
	private int saveProduct(@RequestBody Product c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Product")  
	private Product update(@RequestBody  Product c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}