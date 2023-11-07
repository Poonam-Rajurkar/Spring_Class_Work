package com.SpringExample.IOCDemo1;

public class Airtel implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("You are using Airtel Sim for calling.");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("You are using Airtel data.");
	}

}
