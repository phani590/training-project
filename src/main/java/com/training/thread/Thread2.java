package com.training.thread;

public class Thread2 implements Runnable{

		@Override
	public void run() {
			System.out.println("Thread2 is running");
		
	}
		
		public static void main(String[] args) {
			Thread t =new Thread(new Thread2());
			Thread t1 =new Thread(new Thread2());
			Thread t2 =new Thread(new Thread2());
			Thread t3 =new Thread(new Thread2());
			Thread t4 =new Thread(new Thread2());
			Thread t5 =new Thread(new Thread2());
			Thread t6 =new Thread(new Thread2());
			t.start();
			t1.start();
			t2.start();
			t3.start();
	
			t4.start();
			
			t5.start();
			
			t6.start();
		}

}
