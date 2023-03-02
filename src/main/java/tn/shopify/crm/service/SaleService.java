package tn.shopify.crm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.shopify.crm.model.Sale;
import tn.shopify.crm.repository.SaleRepository;


@Service
public class SaleService {

	@Autowired  
	SaleRepository cR;  
	//getting all articles record by using the method findaAll() of CrudRepository  

	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Sale> getAllCategories()   
	{
		List<Sale> categories = new ArrayList<Sale>();  
		cR.findAll().forEach(c -> categories.add(c));  
		return categories;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Sale getSalesById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Sale c)   
	{  
		cR.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cR.deleteById(id);  
	} 

}