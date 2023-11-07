package com.sprdemo.DITypeDemo;
//Dependency injection using setter method
public class Rectangle implements Shape{

	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing " + color + " rectangle.");
	}

}
