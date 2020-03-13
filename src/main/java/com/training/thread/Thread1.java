package com.training.thread;

public class Thread1  extends Thread {

	@Override
	public void run() {
		 for(int i=1;i<5;i++){  
			    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
			    System.out.println(i+":  "+getName());  
			  } 
	}
	
	public static void main(String args[]) throws InterruptedException {
		Thread t =new Thread1();
		t.setName("t1");
		t.setDaemon(true);
		Thread t2 =new Thread1();
		t2.setName("t2");
		Thread t3 =new Thread1();
		t3.setName("t3");
		t3.setPriority(10);
		t2.setPriority(8);
		t.setPriority(1);
	
		
		t.start();
		//t.join();
		t2.start();
		t3.start();

	}
}
