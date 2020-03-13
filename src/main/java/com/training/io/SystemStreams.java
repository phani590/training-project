package com.training.io;

import java.util.Scanner;

public class SystemStreams {

	public static void main(String[] args) {
		//System.err.println("error message");  
		 Scanner sc = new Scanner(System.in); 
		    // String input 
		 System.out.println("enter name");
	        String name = sc.nextLine(); 
	        System.out.println("enter valued:"+name);
	        System.out.println("enter age");
	        int age =sc.nextInt();
	        System.out.println(age);
	        

	}

}
