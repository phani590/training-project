package com.training.array;

public class ArraryExample {
	public static void main(String[] args) {
		int a[] ={15,24,6,67};//0,1,2
		
//		System.out.println(a[0]+"  "+a[1]+"  "+a[2]);
		int aaaa[]=new int[20];
		
		
		int[] ar1 = new int[10];
		ar1[0] =0;
//		ar1[1] =ar1[0] +5;
//		ar1[2] =ar1[1] +5;
//		ar1[3] =ar1[2] +5;
//		ar1[4] =ar1[3] +5;
		
		for(int i =1;i< 5 ;i++){
			ar1[i] = ar1[i-1]+5;//ar1[1] =ar1[0]+5 
		}
		for(int vv:ar1){
			System.out.println(vv);
		}
		
	}
}
