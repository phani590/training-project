package com.training.exception.handling;

public class Person {

	private String name;
	private int age;
	
	public Person(String n,int age) throws InvalidDataException, BadAgeException {
		if (null == n || "".equals(n)) {
			throw new InvalidDataException();
		}
		
		if (age < 0 ||age >120) {
			throw new BadAgeException();
		}
		name = n;	
		this.age=age;
		}
	
	public String toString() {
		return name;}
 

}
