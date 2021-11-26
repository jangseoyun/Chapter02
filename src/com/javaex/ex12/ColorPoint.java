package com.javaex.ex12;

public class ColorPoint extends Point {
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		
	}
	
	public ColorPoint(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	//메서드 g,s
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//메서드 일반

	public void showinfo() {
		System.out.println("x="+x+"y="+y+"color="+color);
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}
}
