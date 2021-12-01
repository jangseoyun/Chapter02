package com.javaex.ex18;

public abstract class Shape implements Drawable{//추상메소드를 가지고 있어서 클래스와 미완성인 부분이 있음 area()
							//Shape 단독으로 인스턴스화 하면안됨(미완성)

	// 필드
	protected String lineColor;
	protected String fillColor;

	// 생성자
	public Shape() {

	}

	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	// 메소드 g,s
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	//인터페이스로 draw를 빼줬기 때문에 제거 가능 
/*	public void draw() {
		System.out.println("선색: "+lineColor+" 면색: "+fillColor+" 도형을 그렸습니다");
	}
*/
	
	//area() 만들지 못함
	public abstract double area(); //추상메소드 내부코드를 작성할 수 없는 상황
									// 자식 클래스에서는 꼭 내부코드를 구현해야한다.
}
