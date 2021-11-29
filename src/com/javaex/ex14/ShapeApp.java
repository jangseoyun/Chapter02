package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		//=========사각형==============================
		/*
		Shape s01 = new Shape("빨강","빨강");
		System.out.println(s01.toString());
		*/
		
		//사각형을 관리할 배열을 만든다.
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형을 만든다 (객체)
		Rectangle r01 = new Rectangle("빨강","빨강",5,5);
		//System.out.println(r01.toString());//재정의 toString나옴 

		Rectangle r02 = new Rectangle("노랑","노랑",7,7);
		Rectangle r03 = new Rectangle("파랑","파랑",10,10);
		
		//사각형을 배열에 넣는다(대입)
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//배열을 순회하면서 전체 출력한다.
		for(int i = 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		System.out.println("=======================");
		//============원==============================
		
		//원을 관리할 배열을 만든다
		Circle[] cArray = new Circle[3];
		
		//원을 만든다 (객체)
		Circle c01 = new Circle("빨강","빨강",5);
		Circle c02 = new Circle("주황","주황",7);
		Circle c03 = new Circle("보라","보라",20);
		
		//원을 배열에 대입한다. 
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//전체 출력
		for(int i = 0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		System.out.println("=======================");
		//========삼각형===============================
		
		//삼각형을 관리할 배열 생성
		Triangle[] tArray = new Triangle[3];
		
		//삼각형 객체 생성
		Triangle t01 = new Triangle("파랑","파랑",5,5);
		Triangle t02 = new Triangle("분홍","분홍",10,20);
		Triangle t03 = new Triangle("연두","연두",7,15);
		
		//삼각형을 배열에 대입
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		//배열 전체 출력
		for(int i = 0; i<tArray.length; i++) {
			tArray[i].draw();
		}
	}

}
