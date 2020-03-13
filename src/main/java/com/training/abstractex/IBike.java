package com.training.abstractex;



public interface IBike {

	public void run();
	public String getWheelType();
	default public void testMehtod(){}
	
}
