package com.training.abstractex;

public class Honda extends Bike {

	public Honda(String wheelType) {
		super(wheelType);
	}

	@Override
	protected
	void run() {
		System.out.println("hoda is running");
		
	}
	
	

}
