package com.training.inheritance.polymorphism;

import com.training.inheritance.test.InitializerBlock2;

public class Initializerblock  extends InitializerBlock2{
 final int a=10;
 int b;
 
 
  public Initializerblock(){
	  //System.out.println("cons");
  }
 
 {
	//// System.out.println("Initializerblock");
	 b= (a>10)?10:20;
 }
 
 public static void main(String[] args) {
	 
	 InitializerBlock2 parentRef = new Initializerblock();
//	 Initializerblock childRef =new InitializerBlock2();
//	 childRef.testMethod2();
//	 
	//InitializerBlock2 vv2 =new InitializerBlock2();
	
	//Initializerblock vv =new Initializerblock();
	 
	 parentRef.testMethod();
	 
	// vv2.testMethod();
	 
	 //vv.testMethod();
	 
	}
 
 public void testMethod(){
		System.out.println("sub testMethod");
	}
 
 public void testMethod2(){
		System.out.println("sub testMethod2");
	}
 
 
}
