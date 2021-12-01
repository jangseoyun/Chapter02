package com.javaex.ex17;

public class Rectangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Rectangle() {
		super(); // Shape 기본 생성자 Shape();
	}

	public Rectangle(String lineColor, String fillColor, int width, int height) {
		// 모 생성자로 접근하는 방법 (필드 접근 제어자는 그대로 private)
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	/*
	 * public Rectangle(String lineColor, String fillColor,int width, int height) {
	 * //모 클래스에서 필드 접근 제거자 private로 해둔경우 
	 * super.setLineColor(lineColor);
	 * super.setFillColor(fillColor); 
	 * this.width = width; 
	 * this.height = height; }
	 */

	/*
	 * public Rectangle(String lineColor, String fillColor,int width, int height) {
	 * //모 클래스 필드 접근 제어자 protected로 해둔경우 
	 * super.fillColor = fillColor;
	 * super.lineColor = lineColor; 
	 * this.width = width; 
	 * this.height = height; }
	 */

	// 메소드 g,s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	

	// 메소드 일반
	//부모쪽에도 같은 메소드가 있다. 부모쪽의 메소드 사용 못하게 하기위해 같은 이름으로 "재정의"
	/*
	@Override//private으로 막았을 경우 
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}
	*/
	
	@Override //"재정의" 접근 제어자 protected 인 경우 
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	
	//자식 클래스가 draw() 만드시 만들지 않아도 됨 (오버라이드)
	public void draw() {//draw() 메소드를 작성하지 않으면 부모의 draw() 사용됨
		System.out.println("선색:"+super.lineColor+" 면색:"+super.fillColor+" 가로:"+width+" 세로:"+height+" 사각형을 그렸습니다.");
	}
	
	
	public double area() { //Shape 추상클래스(미완성 클래스)를 상속받았음
							//Shape을 상속 받으려면 미완성인 부분을 구현해줘야함 area() 작성해야함 
		double result = width*height;
		return result;
	} // 원이 double값이라 double로 통일해줌 
	
	
	

}
