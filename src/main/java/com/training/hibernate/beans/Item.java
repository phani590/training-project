package com.training.hibernate.beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long itemId;
	private String name;
	private long price;
	private int quantity;
	private long maxDiscount;
	
	public Item() {}
	
	public Item(String name,long price,int quantity){		
		this.name = name;
		this.price = price;		
		this.quantity = quantity;		
	}
	
	@ManyToMany(mappedBy="items",cascade=CascadeType.ALL)
	private Collection<Bill> bills = new ArrayList<>();

	/**
	 * @return the itemId
	 */
	public long getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the maxDiscount
	 */
	public long getMaxDiscount() {
		return maxDiscount;
	}

	/**
	 * @param maxDiscount the maxDiscount to set
	 */
	public void setMaxDiscount(long maxDiscount) {
		this.maxDiscount = maxDiscount;
	}

	/**
	 * @return the bills
	 */
	public Collection<Bill> getBills() {
		return bills;
	}

	/**
	 * @param bills the bills to set
	 */
	public void setBills(Collection<Bill> bills) {
		this.bills = bills;
	}
	
}
