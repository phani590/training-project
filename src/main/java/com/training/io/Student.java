package com.training.io;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	
	 int id;  
	 String name;  
	 transient  Address address;
	 
	 public Student(int id, String name,Address address) {  
	  this.id = id;  
	  this.name = name;  
	  this.address =address;
	 }  
}
