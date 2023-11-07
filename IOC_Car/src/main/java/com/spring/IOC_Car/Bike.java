package com.spring.IOC_Car;

public class Bike implements Engine{

	@Override
	public void singalEngine() {
		// TODO Auto-generated method stub
		System.out.println("All Bikes have singal engine.");
	}

	@Override
	public void ecgEngine() {
		// TODO Auto-generated method stub
		System.out.println("Bikes don't have ECG engine.");
	}

}
