package com.training.abstractex.mypro;

import com.training.abstractex.Bike;

public class MyHonda extends Bike {

	public MyHonda(String wheelType) {
		super(wheelType);
	}

	@Override
	protected void run() {
		System.out.println("MyHonda is running");
		this.testMethod();
		
	}

}
