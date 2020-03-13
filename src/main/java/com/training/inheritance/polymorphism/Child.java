package com.training.inheritance.polymorphism;

import com.training.inheritance.test.Parent;

public class Child extends Parent{
	 
	 public void testMethod(){
			System.out.println("sub testMethod");
		}
	 
	 public void testMethod2(){
			System.out.println("sub testMethod2");
			this.testMethodPro();
		}
	 
	 
	 
	 public static void main(String[] args) {
		 
		 Child  childObj= new Child();
		 childObj.testMethod2();
		 Parent  parentObj = new Parent();
		// teeee(new Child());
		// parentref.testMethod();
		 //System.out.println(childObj instanceof Child);
		}
	 
public static void teeee(Parent parentref) {
	parentref.testMethod();
		}
}
