package com.training.hibernate.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BILLS")
public class Bill {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long billId;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="MP_BILL_ITEM", 
		joinColumns= @JoinColumn(name="BILL_ID"),
		inverseJoinColumns=@JoinColumn(name="ITEM_ID"))
		private Collection<Item> items= new ArrayList<>();
	
	private long totalDiscount;
	private long billAmount;
	private Date billDate;	
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CUST_ID")
	private Customer customer;
	
	/**
	 * @return the billId
	 */
	public long getBillId() {
		return billId;
	}

	/**
	 * @param billId the billId to set
	 */
	public void setBillId(long billId) {
		this.billId = billId;
	}

	/**
	 * @return the items
	 */
	public Collection<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Collection<Item> items) {
		this.items = items;
	}

	/**
	 * @return the totalDiscount
	 */
	public long getTotalDiscount() {
		return totalDiscount;
	}

	/**
	 * @param totalDiscount the totalDiscount to set
	 */
	public void setTotalDiscount(long totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	/**
	 * @return the billAmount
	 */
	public long getBillAmount() {
		return billAmount;
	}

	/**
	 * @param billAmount the billAmount to set
	 */
	public void setBillAmount(long billAmount) {
		this.billAmount = billAmount;
	}

	/**
	 * @return the billDate
	 */
	public Date getBillDate() {
		return billDate;
	}

	/**
	 * @param billDate the billDate to set
	 */
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}	

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void generateBillAmount(){
		
		for(Item item : this.items){
			this.billAmount += item.getPrice() * item.getQuantity();
		}
		
		for(Item item : this.items){
			this.totalDiscount += item.getMaxDiscount() * item.getQuantity();
		}
		
	}
	

}
