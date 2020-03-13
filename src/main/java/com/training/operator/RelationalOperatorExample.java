package com.training.operator;

public class RelationalOperatorExample {
	
public  static void  main(String[] args) {
	
	int a =20;
	int b=10;
	if(a >= b){
		System.out.println("a is grether then b");
	}
		
	if(a <= b){
		System.out.println("a is less then b");
	}
	if(a == b){
		System.out.println("a equals b");
	}
	if(a != b){
		System.out.println("a not equals b");
	}
	
	int min ;//= (a > b)?b:a;
	
	
	if(a>b){
		min = b;
	}else{
		min=a;
	}
	System.out.println(min);
	
	}


}
