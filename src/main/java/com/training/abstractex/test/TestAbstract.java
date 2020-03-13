package com.training.abstractex.test;

import com.training.abstractex.Bike;
import com.training.abstractex.Honda;
import com.training.abstractex.MyBike;
import com.training.abstractex.mypro.MyHonda;

public class TestAbstract {

	public static void main(String[] arg) {
		Bike honda =new Honda("wheeel");
		Bike myBike =new MyBike("wheeel");
		
		MyHonda mm = new MyHonda("sfsdf");
	//	mm.run
	}
}
