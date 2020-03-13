package com.training.practice;

public class FibonacciSequence {
	
	public static void main(String[] args) {
	int fibSeq[] =new int[15];
	fibSeq[0]=0;
	fibSeq[1]=fibSeq[0]+1;
	System.out.println(fibSeq.length);
	for(int i =2;i< fibSeq.length;i++){
		fibSeq[i]=fibSeq[i-1]+fibSeq[i-2];
	}
	
	for(int seqVal:fibSeq){
		System.out.println(seqVal);
	}
	}
}
