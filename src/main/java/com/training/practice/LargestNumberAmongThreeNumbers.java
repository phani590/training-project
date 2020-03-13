package com.training.practice;

public class LargestNumberAmongThreeNumbers {
	public static void main(String[] args) {
		int x =15,y=24,z=6;
		int a[] ={15,24,6};//0,1,2
		System.out.println(a[0]+"  "+a[1]+"  "+a[2]);
		
		if( x >y && x > z){
			System.out.println(x +" is largest ");
		}else if(y > x && y > z){
			System.out.println(y +" is largest ");
		}else if(z > x && z > y){
			System.out.println(z +" is largest ");
		}
	}
}
