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

import tn.shopify.crm.model.Client;
import tn.shopify.crm.service.ClientService;




@RestController 
//@CrossOrigin(origins = "*")
public class ClientController {
	
	//autowire the BooksService class  
		@Autowired  
		ClientService cS;  

		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/Client")
		
		private List<Client> getAllClients()   
		{  
			return cS.getAllClients();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/Client/{idClient}")  
		private Client getClient(@PathVariable("idClient") int id)   
		{  
			return cS.getClientById(id);  
		}  


		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/Client/{Clientid}")  
		private void deleteClient(@PathVariable("Clientid") int id)   
		{  
			cS.delete(id) ;
		} 

		@PostMapping("/Client")  
		private int saveClient(@RequestBody Client r)   
		{  
			cS.saveOrUpdate(r);
			return r.getIdClient();  
		} 

		//creating put mapping that updates the book detail
		//@CrossOrigin(origins = "*")
		@PutMapping("/Client")  
		private Client update(@RequestBody  Client r)   
		{  
			cS.saveOrUpdate(r);  
			return r;  
		}  
}
