package tn.shopify.crm.repository;

import org.springframework.data.repository.CrudRepository;

import tn.shopify.crm.model.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> 
{  
	
}