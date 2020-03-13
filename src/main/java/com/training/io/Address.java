package com.training.io;

import java.io.Serializable;

public class Address  {
 int id;
 String city;
 public Address(int id,String city){
	 this.id=id;
	 this.city=city;
 }
 
 @Override
	public String toString() {
		
		return id+"  "+city;
	}
}
