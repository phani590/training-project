package com.training.thread;

public class MyThread4 extends Thread{  
	Table t;  
	MyThread4(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  

}
