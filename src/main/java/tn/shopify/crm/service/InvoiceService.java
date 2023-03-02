package tn.shopify.crm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.shopify.crm.model.Invoice;
import tn.shopify.crm.repository.InvoiceRepository;



@Service 
public class InvoiceService {

	@Autowired  
	InvoiceRepository InvoiceRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Invoice> getAllInvoice()   
	{  
		List<Invoice> invoice = new ArrayList<Invoice>();  
		InvoiceRepository.findAll().forEach(invoice1 -> invoice.add(invoice1));  
		return invoice;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Invoice getinvoiceById(int id)   
	{  
		return InvoiceRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Invoice invoice)   
	{  
		InvoiceRepository.save(invoice);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		InvoiceRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(	Invoice invoice, int id)   
	{  
		InvoiceRepository.save( invoice);  
	}  


}


