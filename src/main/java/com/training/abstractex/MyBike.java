package com.training.abstractex;

public class MyBike  extends Bike  {

	public MyBike(String wheelType) {
		super(wheelType);
	}

	@Override
	public void run() {
		System.out.println("MyBike is running");
	}

}
