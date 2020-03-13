package com.training.inheritance.test;

import com.training.inheritance.Address;
import com.training.inheritance.Animal;
import com.training.inheritance.Cat;
import com.training.inheritance.Dog;
import com.training.inheritance.Employee;
import com.training.oops.BanckAccount;
import com.training.oops.HouseLoan;
import com.training.oops.PersoalLoan;

public class TestInheritance {

	public static void main(String[] args) {
		PersoalLoan loan1;
		loan1=new PersoalLoan(12);
		//System.out.println(loan1.interestRate());
		
		HouseLoan houseLoan =new HouseLoan();
		System.out.println(houseLoan.interestRate());
		
		BanckAccount cc =new BanckAccount();
	//	cc.accountName ="Chaning the Name bank";
		
		cc.setAccountName("sgdsdfgd");
		
	}
	
	

}
