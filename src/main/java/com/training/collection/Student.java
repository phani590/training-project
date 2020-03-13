package com.training.collection;

public class Student implements Comparable<Student> {
	public String name;  
	public int age;
	
	  public Student(String name) {  
	    this.name = name;  
	  }
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}  
}
