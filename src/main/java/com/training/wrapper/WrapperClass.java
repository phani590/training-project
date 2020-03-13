package com.training.wrapper;

import com.training.abstractex.Honda;

public class WrapperClass {
	public static void main(String[] arg){
		int a=20;
		Integer i = Integer.valueOf(a);
		Integer j = a;//Autoboxing
		int b = j;//unboxing
	//	System.out.println(a+" "+i+" "+j); 
		//print(a);
		callByValue(20); 
		System.out.println(a);//20 or 56
		
		Honda cc =new Honda("aaaaa");
		callByRef(cc);
		System.out.println(cc.getWheelType());//bbbbbb
	}
	
	
	public static int print(int a){
		if(a < 0){
			return -1;
		}
		System.out.println(a);
		return print(--a);
	}
	
	public static void callByValue(int callValue){
		callValue =56;
	}
	
	public static void callByRef(Honda cc){
		cc.setWheelType("bbbbbbb");
		//cc =new Honda("bbbbbb");
	}
}
