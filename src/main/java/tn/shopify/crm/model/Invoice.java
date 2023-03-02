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
	@OneToMany
	@JoinColumn(name="idsale", referencedColumnName="id")
	@Column  
	private int discoun;  
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
	public int getDiscoun() {
		return discoun;
	}
	public void setDiscoun(int discoun) {
		this.discoun = discoun;
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
		return "Invoice [id=" + id + ", discoun=" + discoun + ", tax=" + tax + ", total=" + total + "]";
	}
}
	