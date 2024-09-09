package com.javalec.ex;


public class ShapeRectangle implements Shape {
	private double width;
	private double height;
	
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
	
	@Override
	public double getArea() {
		return width * height;
	}
	
}
