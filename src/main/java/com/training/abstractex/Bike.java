package com.training.abstractex;

abstract public class Bike{
	
	private String wheelType;
    
    public Bike(String wheelType){
    	this.wheelType =wheelType;
    }
	
	protected abstract void run();
	
	protected  void testMethod(){
		System.out.println("Test method");
	}
	
	public String getWheelType(){
		return this.wheelType;
	}
	
	public void setWheelType(String ww){
		this.wheelType =ww;
	}
	
}
