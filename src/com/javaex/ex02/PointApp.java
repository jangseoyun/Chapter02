package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) { //메소드
		
		Point first	= new Point();

		first.setX(5);
		first.setY(5);
		first.draw();
		
		Point last = new Point();
		
		last.setX(10);
		last.setY(23);
		last.draw();

	}

}
