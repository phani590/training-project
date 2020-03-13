package com.training.hibernate.dao;
import org.hibernate.Session;

import com.training.hibernate.beans.Customer;


public class CustomerDao {
	
	private Session session;

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	public void create(Customer customer){
		
		session.beginTransaction();		
		session.save(customer);		
		session.getTransaction().commit();		
					
	}
	
	public void read(long custId){
		session.beginTransaction();		
		session.get("com.hibernatedemo.beans.Cusomer", custId);	
		session.getTransaction().commit();
	}
	
	
	public void update(Customer customer){
		session.beginTransaction();		
		session.update(customer);	
		session.getTransaction().commit();
	}
	
	
	public void delete(Customer customer){
		session.beginTransaction();		
		session.delete(customer);
		session.getTransaction().commit();
	}

}
