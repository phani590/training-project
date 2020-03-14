package com.training.hibernate.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "customer.byId",  
	        query = "from Customer cust where cust.custId = :custId"  
	        ) ,
	        @NamedQuery(  
	    	        name = "customer.byName",  
	    	        query = "from Customer cust where cust.name = :name"  
	    	        ) 
	    }  
	)  

@Entity
@Table(name="CUSTOMER_DETAILS")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
//@NamedNativeQuery(name="customer.byName", query="select * from customer_details where name = ?")
public class Customer {
	
	@Id
	@GeneratedValue
	private long custId;
	
	@Basic
	private String name;
	
	@Transient
	private String phoneNo;
	
	
	private String emailId;
	
	@Temporal(TemporalType.DATE)
	private Date DateOfBirth;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="ADDRESS",joinColumns = @JoinColumn(name="CUST_ID"))
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns={@Column(name="ADDR_ID")},generator="hilo-gen",type=@Type(type="long"))
	private Collection<Address> addressList = new ArrayList<>();
	
	@OneToOne(mappedBy="customer",cascade=CascadeType.PERSIST)
	private OfferCode offerCode;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.PERSIST)
	private Collection<Bill> bills = new ArrayList<>();
	

	/**
	 * @return the custId
	 */
	public long getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(long custId) {
		this.custId = custId;
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
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	/**
	 * @return the addressList
	 */
	public Collection<Address> getAddressList() {
		return addressList;
	}

	/**
	 * @param addressList the addressList to set
	 */
	public void setAddressList(Collection<Address> addressList) {
		this.addressList = addressList;
	}

	/**
	 * @return the offerCode
	 */
	public OfferCode getOfferCode() {
		return offerCode;
	}

	/**
	 * @param offerCode the offerCode to set
	 */
	public void setOfferCode(OfferCode offerCode) {
		this.offerCode = offerCode;
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
