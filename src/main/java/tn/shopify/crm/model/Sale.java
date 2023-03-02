package tn.shopify.crm.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@ManyToOne(optional=false)
	@JoinColumn(name="idinvoice", referencedColumnName="id")
	private Invoice invoice ; 

	@OneToOne(optional=false)
	@JoinColumn(name="idproduct", referencedColumnName="id")
	private Product product;
//	private Invoice invoice;
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
	@Override
	public String toString() {
		return "Sale [id=" + id + ", quantity=" + quantity + ", invoice=" + invoice + ", product=" + product + "]";
	}
	
	


}