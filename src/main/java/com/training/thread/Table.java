package com.training.thread;

public class Table {
	int a=0;
	  void printTable(int n){//method not synchronized  
		synchronized(this)
		{
		   for(int i=1;i<=5;i++){  
			   a =n*i;
		     System.out.println(n*i); //n=5 is 5 10 15 20 25 
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		}
		 }  
}
