package com.training.hibernate.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OFFERS")
public class OfferCode {
	
	@Id
	private String promoCode;
	private int discountAmount;
	private int discountPercent;
	private Date valiedFrom;
	private Date validTill;
	private int minPurchaseAmt;
	private int maxPurchaseAmt;	
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CUST_ID")
	private Customer customer;	
	
	public OfferCode(){}
	
	public OfferCode(String promocode,int discountAmount){
		
		this.discountAmount = discountAmount;
		this.promoCode = promocode;
		
	}

	/**
	 * @return the promoCode
	 */
	public String getPromoCode() {
		return promoCode;
	}

	/**
	 * @param promoCode the promoCode to set
	 */
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	/**
	 * @return the discountAmount
	 */
	public int getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * @param discountAmount the discountAmount to set
	 */
	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	/**
	 * @return the discountPercent
	 */
	public int getDiscountPercent() {
		return discountPercent;
	}

	/**
	 * @param discountPercent the discountPercent to set
	 */
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	/**
	 * @return the valiedFrom
	 */
	public Date getValiedFrom() {
		return valiedFrom;
	}

	/**
	 * @param valiedFrom the valiedFrom to set
	 */
	public void setValiedFrom(Date valiedFrom) {
		this.valiedFrom = valiedFrom;
	}

	/**
	 * @return the validTill
	 */
	public Date getValidTill() {
		return validTill;
	}

	/**
	 * @param validTill the validTill to set
	 */
	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	/**
	 * @return the minPurchaseAmt
	 */
	public int getMinPurchaseAmt() {
		return minPurchaseAmt;
	}

	/**
	 * @param minPurchaseAmt the minPurchaseAmt to set
	 */
	public void setMinPurchaseAmt(int minPurchaseAmt) {
		this.minPurchaseAmt = minPurchaseAmt;
	}

	/**
	 * @return the maxPurchaseAmt
	 */
	public int getMaxPurchaseAmt() {
		return maxPurchaseAmt;
	}

	/**
	 * @param maxPurchaseAmt the maxPurchaseAmt to set
	 */
	public void setMaxPurchaseAmt(int maxPurchaseAmt) {
		this.maxPurchaseAmt = maxPurchaseAmt;
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
	
}
