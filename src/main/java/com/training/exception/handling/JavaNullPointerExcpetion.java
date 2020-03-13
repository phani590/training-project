package com.training.exception.handling;

import java.io.File;
import java.io.IOException;

public class JavaNullPointerExcpetion {
	public static void main(String args[]) throws IOException  {  
		   try{  
		      //code that may raise exception  
		      String s =null;
		    //  s.equals("phani");
		      
		      int arr[]= {1,3,5,7};
		      arr[3]= 34/0;
		      arr[1]= 33/3;
		     System.out.println(arr[10]); 
		   
	   }catch(ArithmeticException e){
			   System.out.println(e);
			   }
		   catch(NullPointerException e){
			   System.out.println(e);
			   }  
		   catch(NumberFormatException e){
			   System.out.println(e);
			   }
		   catch(RuntimeException e){
			   System.out.println(e);
			   }
		   //rest code of the program   
		   String s="1234";  
		   int i=Integer.parseInt(s);//NumberFormatException  
		   System.out.println(s);
		   
		  
			test();
		
		   
		   test2();
	}
	
	
	
	public  static void test()throws IOException{
		File f =new File("test");
		
	}
	
	public  static void test2()throws RuntimeException{
		File f =new File("test");
		
		throw new RuntimeException();
		
	}
}
