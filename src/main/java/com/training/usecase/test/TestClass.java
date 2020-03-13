package com.training.usecase.test;

import com.training.usecase.BankAccount;

public class TestClass {
	
	public static void main(String[] args) {
		Long accountNumber =1L;
		String holderName = "phani";
		String photoId="photo1";
		String adressProf="address1";
		String PanCard="nam7797";
		 
		
		BankAccount account = new BankAccount(accountNumber, holderName,//
				photoId, adressProf, PanCard,BankAccount.SAVING_ACCOUNT);
		account.deposite(1000);
		System.out.println(account.getBalance());
		
	}
		  
}
