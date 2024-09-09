package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AreaMainClass {
	
	public static void main(String[] args) {
		
		String configLocation = "classpath:appCTX2.xml";
		
		//스프링 => ioc 컨테이너
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		Triangle triangle = ctx.getBean("triangle", Triangle.class);
		
		System.out.println("삼각형");
		System.out.println("가로는 " + triangle.getWidth() + " , 세로는 " + triangle.getHeight() + "입니다.");
		System.out.println("삼각형의 넓이는 " + triangle.getArea() + "입니다.");
		
		Rectangle rectangle = ctx.getBean("rectangle", Rectangle.class);
		
		System.out.println("사각형");
		System.out.println("가로는 " + rectangle.getWidth() + ", 세로는 " + rectangle.getHeight() + "입니다.");
		System.out.println("사각형의 넓이는 " + rectangle.getArea());
		
		
		ctx.close();
		
	}
	
}
