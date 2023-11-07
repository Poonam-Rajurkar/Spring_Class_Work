// IOC Container - Inversion of Control

package com.SpringExample.IOCDemo1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vodaphone  obj = new Vodaphone();
		obj.calling();
		obj.data();
		
		Sim sim = new Airtel();
		sim.calling();
		sim.data();
	}

}
