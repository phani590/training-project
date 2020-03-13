package com.training.abstractex;

public class HondaActive implements IBike {

private String wheelType;
    
    public HondaActive(String wheelType){
    	this.wheelType =wheelType;
    }
	
	@Override
	public void run() {
		System.out.println("hoda is running");
	}

	@Override
	public String getWheelType() {
		return wheelType;
	}
}
