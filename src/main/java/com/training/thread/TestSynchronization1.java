package com.training.thread;

public class TestSynchronization1 {

	public static void main(String[] args) throws InterruptedException {
		Table obj = new Table();//only one object  
		MyThread3 t1=new MyThread3(obj);  
		MyThread4 t2=new MyThread4(obj);  
		t1.start();  
		t2.start();  
		
		Thread.sleep(400* 10);  
		
		System.out.println("a="+obj.a);

	}

}
