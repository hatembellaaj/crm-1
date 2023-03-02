package tn.shopify.crm.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  
	private int id; 
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idclient", referencedColumnName="id") 
	private Client client ; 
	
	@OneToMany
	@JoinColumn(name="idsale", referencedColumnName="id")
	private Sale sale ; 
	
	@Column  
	private int discount;  
	@Column  
	private double tax ;  
	@Column  
	private double total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", client=" + client + ", sale=" + sale + ", discount=" + discount + ", tax=" + tax
				+ ", total=" + total + "]";
	}

}
	