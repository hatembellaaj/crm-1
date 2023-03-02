package tn.shopify.crm.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.shopify.crm.model.Product;
import tn.shopify.crm.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired  
	ProductRepository cR;  
	//getting all articles record by using the method findaAll() of CrudRepository  

	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Product> getAllCategories()   
	{
		List<Product> categories = new ArrayList<Product>();  
		cR.findAll().forEach(c -> categories.add(c));  
		return categories;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Product getProductsById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Product c)   
	{  
		cR.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cR.deleteById(id);  
	} 

}