package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) { //메소드
		
		Point first	= new Point(3, 6);
		
		//first.setX(5);
		//first.setY(5);
		first.draw();
		
		Point last = new Point(7, 7);
		
		//last.setX(10);
		//last.setY(23);
		last.draw();
		/*
		Point p03 = new Point(100); //x는 100 
		p03.setY(101);
		p03.draw();
		*/
		Point p03 = new Point(55, 65);
		p03.draw(true);
		p03.draw(false);
		p03.draw();
		
		

	}

}
