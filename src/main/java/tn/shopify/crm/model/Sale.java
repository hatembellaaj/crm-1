package tn.shopify.crm.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity  
@Table 
public class Sale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column   
	private float quantity; 
	
	@Column  
	private float price;

	@Column  
	private int tax;

	@Column  
	private float discount;
	

	@ManyToOne(optional=false)
	@JoinColumn(name="idinvoice", referencedColumnName="id")
	private Invoice invoice ; 

	@OneToOne(optional=false)
	@JoinColumn(name="idproduct", referencedColumnName="id")
	private Product product;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Sale [id=" + id + ", quantity=" + quantity + ", price=" + price + ", tax=" + tax + ", discount="
				+ discount + ", invoice=" + invoice + ", product=" + product + "]";
	}

	
	


}