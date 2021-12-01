package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		//사각형 모+자 메모리에 올림
		Rectangle r01 = new Rectangle("빨강","빨강",5,10);
		System.out.println(r01.area());//사각형 면적 출력
		
		//원 모+자 메모리에 올림
		Circle c01 = new Circle("노랑","노랑",5);
		System.out.println(c01.area());//원 면적 출력
		
		//삼각형 모+자 메모리에 올림
		Triangle t01 = new Triangle("파랑","파랑",5,10);
		System.out.println(t01.area());//삼각형 면적 출력
		*/
		
		//-----섞어쓰기---------------------
		
		//shape 배열 공간 생성 (섞어 쓴 이유: 배열울 만든다 Shape[] ---> 모든 도형을 한 배열에 관리한다.)
		Shape[] sArray = new Shape[3];
		
		//메모리에 도형 객체 생성
		//섞어쓰기 (모+자 메모리에 올리고 자 가리기)
		Shape r01 = new Rectangle("빨강","빨강",5,10);
		Shape c01 = new Circle("노랑","노랑",5);
		Shape t01 = new Triangle("파랑","파랑",5,10);
		
		//베열에 객체 대입 
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		//한번에 모든 도형의 면적 출력하기
		for(int i =0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
		
	}

}
