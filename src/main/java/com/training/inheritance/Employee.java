package com.training.inheritance;

public class Employee {
	int id;  
	String name;  //arun
	Address address; 
	
	  
	public Employee(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	
	@Override
	public String toString() {
		//return id+" "+name+" "+address.city+" "+address.state+" "+address.country;
		return super.toString();
	}
	  
	public	void display(){  
		System.out.println(this);
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
}
