package com.training.oops.test;

import com.training.oops.BanckAccount;

public class TestClass {
	
	 public static void main(String args[]){
		 
		 BanckAccount bankAcc = new BanckAccount(10L,"phani");
		 
		 System.out.println(bankAcc.getAccountName());
		 System.out.println(bankAcc.getAccNumber());
		 System.out.println(bankAcc.getBalance());
				 
		 // javac
		 // java TestClass.main([]);
	 }
}
