package com.javaex.ex02;

public class Point {
	// setX() getX() 메소드명
	// setY() getY()
	// 한줄 출력 draw()

	// 필드
	private int x;
	private int y;

	// 생성자
	
	 public Point() { //해당 클래스를 메모리에 올리는 일 //System.out.println("Point()실행");
	  //디폴트 생성자
	 }
	 
	 public Point(int x) {
		this.x = x;
	 }
	 
	public Point(int x, int y) {
		// 해당클래스를 메모리에 올리는 일
		this.x = x;
		this.y = y;// 추가로 해줘
	}

	// 메소드
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("점[x="+x+","+"y="+y+"]을 그렸습니다.");
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
