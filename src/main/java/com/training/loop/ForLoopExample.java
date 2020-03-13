package com.training.loop;

public class ForLoopExample {

	public static void main(String[] args) {  
	   // forLoopToPrintNNumbers(50);  
	  forEachLoop();  
	}

	public static void forLoopToPrintNNumbers(int n) {
		//Code of Java for loop  
	    for(int i=1;i<=n;i++){  
	        System.out.println(i);  
	    }
	}

	public static void forEachLoop() {
		//Declaring an array  
		    int arr[]={12,23,44,56,78}; 
		    
		    for(int i=0;i<arr.length;i++){  
		        System.out.println(arr[i]);  
		    }
		    
		    System.out.println("Printing array using for-each loop"); 
		    //Printing array using for-each loop  
		    for(int i:arr){  
		        System.out.println(i);  
		    }
	} 
}
