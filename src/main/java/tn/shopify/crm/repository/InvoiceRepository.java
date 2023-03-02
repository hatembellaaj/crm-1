package tn.shopify.crm.repository;

import org.springframework.data.repository.CrudRepository;

import tn.shopify.crm.model.Invoice;

public interface InvoiceRepository  extends CrudRepository<Invoice, Integer>{

}