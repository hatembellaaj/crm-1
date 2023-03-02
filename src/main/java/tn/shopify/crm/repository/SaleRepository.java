package tn.shopify.crm.repository;
import org.springframework.data.repository.CrudRepository;

import tn.shopify.crm.model.Sale;


public interface SaleRepository extends CrudRepository<Sale, Integer> 
{  
	
}