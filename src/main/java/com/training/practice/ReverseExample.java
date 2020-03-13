package com.training.practice;

public class ReverseExample {
	public static final String TEST ="test";
	public static void main(String[] args) {
		int num =4321456,reverseNum=0;
		for(int reamingNum =num;reamingNum > 0 ;reamingNum=reamingNum/10 ){
			int d = reamingNum%10;
			reverseNum *= 10 ;
			reverseNum += d;
		}
	
		
		System.out.println(reverseNum);
		
	}
}


class ADetails{}