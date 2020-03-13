package com.training.inheritance.polymorphism;

import com.training.inheritance.test.Parent;

//Method Overloading in Java
public class Maths {

	// return type methodName(arguments)
	public int add(int a,int b){
		return a+b;
	}
	
	public int add(int a,int b,int c){
		return a+b+c;
	}
	
	public double add(double a,double b){
		return a+b;
	}
	
	 public static void main(String[] args) {
		 Maths mat= new Maths();
		 //System.out.println(mat.add(20, 10,10));
		 Parent parent =new Parent();
		 parent.testMethod();
		 Child child =new Child();
		 
		}
}
