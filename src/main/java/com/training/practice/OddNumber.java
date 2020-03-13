package com.training.practice;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    // String input 
	 System.out.println("enter number");
        		int x=sc.nextInt();
		if(x%2 == 1){
			System.out.println("Odd number");
		}else{
			System.out.println("Even number");
		}
	}
}
