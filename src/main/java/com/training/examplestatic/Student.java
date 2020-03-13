package com.training.examplestatic;

import com.training.variable.VariableClass;

public class Student extends VariableClass {
	//defining fields  
	private int id;//field or data member or instance variable  
	private String name;  
	private static String college="ITS";
	 
    public	int getId(){return id;}
    public	String getName(){ return name;}
	 
	 //creating main method inside the Student class  
	 public static void main(String args[]){  
	  //Creating an object or instance  
	  Student s1=new Student();//creating an object of Student
	  s1.id=1;s1.name ="aaa";
	  //Printing values of the object
	  System.out.println(Student.college);  
	  System.out.println("after change"); 
	  
	  Student s2=new Student();//creating an object of Student  
	  s2.id=2;s2.name="bb";
	  Student.college="eee";
	  
	  s2.id=10;
	  
	  System.out.println(" college for s1:"+ s1.college); 
	  System.out.println(" college for s2:"+s2.college); 
	 }  
	 
	 public static void change(){  
	     college = "BBDIT";  
	     }  
}
