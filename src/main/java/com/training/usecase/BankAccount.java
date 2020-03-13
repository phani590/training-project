package com.training.usecase;

public class BankAccount {
	
	private Long accountNumber;
	private String holderName;
	private String photoId;
	private String adressProf;
	private String PanCard;
	private String accountType;
	private double balance; 
	
	public final static String SAVING_ACCOUNT="SAVING_ACCOUNT";
	public final static String CURRENT_ACCOUNT="CURRENT_ACCOUNT";
 
	public BankAccount(Long accountNumber,String holderName,String photoId,//
			String adressProf,String PanCard,String accountType){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.photoId=photoId;
		this.adressProf=adressProf;
		this.PanCard=PanCard;
		this.balance=0;
		this.accountType =accountType; 
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public String getAdressProf() {
		return adressProf;
	}

	public void setAdressProf(String adressProf) {
		this.adressProf = adressProf;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public String getPanCard() {
		return PanCard;
	}
	
	public void deposite(double amount){
		this.balance += amount;
	}
	
	public void withdra(double amount){
		if(this.balance-amount >= 0){//insufficient
			this.balance -= amount;
		}else{
			throw new RuntimeException("insufficient balance");
		}
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public String getAccountType(){
		return this.accountType;
	}


}
