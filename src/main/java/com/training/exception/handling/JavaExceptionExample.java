package com.training.exception.handling;

public class JavaExceptionExample {
	public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }
		   catch(ArithmeticException e){
			   System.out.println(e);
			   } 
		  finally {
				   System.out.println("finally of the code...");  
			} 
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		   
		   //final 
		   
	}

	/// try catch finally throws throw
}
