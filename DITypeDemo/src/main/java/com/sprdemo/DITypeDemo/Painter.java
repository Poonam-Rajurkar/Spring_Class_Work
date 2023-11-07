package com.sprdemo.DITypeDemo;

public class Painter implements Performer {

	private Shape shape;
	
	public Painter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Painter is drawing. ");
		shape.draw();
	}
	
}
