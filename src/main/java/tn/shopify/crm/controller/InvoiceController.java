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

import tn.shopify.crm.model.Invoice;
import tn.shopify.crm.service.InvoiceService;

@RestController 
@CrossOrigin(origins = "*")
public class InvoiceController {
	
	//autowire the BooksService class  
		@Autowired  
		InvoiceService InvoiceService;  

		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/invoice")
		
		private List<Invoice> getAllInvoice()   
		{  
			return InvoiceService.getAllInvoice();
					  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/invoice/{id}")  
		private Invoice getinvoice(@PathVariable("id") int id)   
		{  
			return InvoiceService.getinvoiceById(id);
				 
		}  


		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/invoice/{id}")  
		private void deleteInvoice(@PathVariable("id") int id)   
		{  
			InvoiceService.delete(id);  
		} 

		@PostMapping("/invoice")  
		private int saveInvoice(@RequestBody Invoice invoice)   
		{  
			InvoiceService.saveOrUpdate(invoice);
			return invoice.getId(); 
		} 

		//creating put mapping that updates the book detail
		//@CrossOrigin(origins = "*")
		@PutMapping("/invoice")  
		
		private Invoice update(@RequestBody  Invoice invoice)   
		{  
			InvoiceService.saveOrUpdate(invoice); 
			return invoice;  
		}  

}