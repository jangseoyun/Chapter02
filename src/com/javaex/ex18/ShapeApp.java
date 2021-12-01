package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		//interface는 점point까지 한 단위로 관리하기 위해서
		/*
		//1) point 메모리 올리기 (구현)
		Point p01 = new Point(5,7);
		p01.draw();
		System.out.println(p01.getX());
		
		//2)point 메모리 올리기 (구현, 인터페이스(drawable) + 섞어쓰기
		Drawable p02 = new Point(114,117);
		p02.draw();
		System.out.println(((Point)p02).getX());//다운 캐스팅);
		*/
		
		//인터페이스 배열만들어서 하나로 관리
		Drawable[] dArray = new Drawable[4];
		
		//객체 생성(섞어쓰기)
		Drawable p01 = new Point(1,1);
		Drawable r01 = new Rectangle("빨강","빨강",5,7);
		Drawable c01 = new Circle("파랑","파랑",12);
		Drawable t01 = new Triangle("노랑","노랑",22,55);
		
		//배열에 객체 대입
		dArray[0] = p01;
		dArray[1] = r01;
		dArray[2] = c01;
		dArray[3] = t01;
		
		//전체 그리기 
		for(int i = 0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//면적출력
		
		/*for(int i = 0; i<dArray.length; i++) {
			((Shape)dArray[i]).area();//강제 형면환하여 면적 출력
			//point는 면적 출력이 없음 따라서 오류가 남
			
		}*/
		
		for(int i = 0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {//지금 주소의 인스턴스(클래스 객체)가 Shape틀에서 만들어졌나?
				System.out.println(((Shape)dArray[i]).area());
			}
			
		}
		
		
	
		
	}

}
