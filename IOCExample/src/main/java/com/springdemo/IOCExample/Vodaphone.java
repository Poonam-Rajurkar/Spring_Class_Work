package com.springdemo.IOCExample;

public class Vodaphone implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("You are using Vodaphone Sim for calling.");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("You are using Vodaphone data.");
	}

}
