package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ShapeMain {
	
	public static void main(String[] args) {
		
		String config = "classpath:appCTX4.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		Shape shape = ctx.getBean("shape", Shape.class);
		
		shape.getArea();
		
		ctx.close();
		
	}
	
}
