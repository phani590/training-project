package com.training.thread;

public class Test {

	public static void main(String[] args) {
		final Customer c=new Customer();  
		
		//THREAD 1 withdraw 15000
		new Thread(){  
		public void run(){c.withdraw(15000);}  
		}.start();  
		
		//THREAD 2 deposit deposit
		new Thread(){  
		public void run(){c.deposit(10000);}  
		}.start();  

	}

}
