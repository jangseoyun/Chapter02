package com.javaex.ex02;

public class Point {
	//setX()   getX() 메소드명 
	//setY()   getY()
	//한줄 출력 draw()
	
	//필드
	private int x;
	private int y;
	
	
	//메소드
	public void setX(int xp) {
		x = xp;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int yp) {
		y = yp;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점 [x="+x+","+"y="+y+"]을 그렸습니다.");
	}
	

}
