package com.training.oops;

import java.math.BigDecimal;

import com.training.abstractex.Honda;

public class BanckAccount implements Cloneable {
	
	//state
	private Long accNumber;
	private String accountName;
	private BigDecimal balance;//10.4566998
	public Honda bike;
	
	public static String SAVING_ACCOUNT="saving Account";
	public static String CURRENT_ACCOUNT="Current Account";
	public static int count =0;
	public int countinst =0;
	//constructor
	public BanckAccount(){
		balance =BigDecimal.ZERO;		
	}
	
	public BanckAccount(Long accNumber){
		this();
		this.accNumber =accNumber;
	}
	
	public BanckAccount(Long accNumber1,String accountName ){
		this(accNumber1);
		this.accountName =accountName;
	}

	// methods
	public void setAccNumber(Long accNumber) {
		this.accNumber = accNumber;
	}

	public void setAccountName(String accountName) {
		if(accountName != null && accountName.contains("bank")){
		this.accountName = accountName;
		}
	}

	public Long getAccNumber() {
		return accNumber;
	}

	public String getAccountName() {
		return accountName;
	}
	

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	public BanckAccount getInstance(){
		return this;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return accountName;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
