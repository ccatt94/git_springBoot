package com.javalec.ex;


public class Triangle{
	private double width;
	private double height;
	
	public Triangle() {}

	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height / 2.0;
	}
	
}
