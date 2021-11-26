package com.javaex.ex12;

public class PointApp {
	//필드
	
	//생성자
	
	//메서드 g,s
	
	//메서드 일반

	public static void main(String[] args) {
		Point p = new Point(4,4);
		p.showinfo();
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.showinfo();
		
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		cp2.showinfo();
	}

}
