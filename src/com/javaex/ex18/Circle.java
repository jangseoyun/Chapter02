package com.javaex.ex18;

public class Circle extends Shape implements Drawable{
	//필드
	private int radius;
	
	//생성자
	public Circle() {
		super();
	}

	public Circle(String lineColor, String fillColor,int radius) {
		super(lineColor,fillColor);
		this.radius = radius;
	}

	//메소드 g,s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", lineColor=" + lineColor + ", fillColor=" + fillColor + ", getRadius()="
				+ getRadius() + "]";
	}
	
	//인터페이스 메소드 구현 
	public void draw() {
		System.out.println("선색:"+super.lineColor+" 면색:"+super.fillColor+" 반지름: "+this.radius+" 원을 그렸습니다.");
	}
	
	
	public double area() {
		double result = radius*radius*3.14;
		return result;
	}
	
}
