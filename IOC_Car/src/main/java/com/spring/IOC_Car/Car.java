package com.spring.IOC_Car;

public class Car implements Engine{

	@Override
	public void singalEngine() {
		// TODO Auto-generated method stub
		System.out.println("Some car have singal engine.");
	}

	@Override
	public void ecgEngine() {
		// TODO Auto-generated method stub
		System.out.println("Some car have ECG engine.");
	}

}
