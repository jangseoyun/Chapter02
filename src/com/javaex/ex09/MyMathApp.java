package com.javaex.ex09;

public class MyMathApp {
	//필드
	
	//생성자
	//디폴트 생성자
	
	//메소드 g,s
	
	//메소드 일반
	public static void main(String[] args) {
		//MyMath클래스 메모리에 올리고
		//plus 코드를 쓴다.
		
//		MyMath mymath = new MyMath();
		//스태틱에 있는것을 사용할 때는 new 생성 안함. 
		//클래스 명으로 선언 MyMath.메소드
		
		int sum01 = MyMath.plus(3, 6);
		System.out.println(sum01);

		double sum02 = MyMath.plus(4.3, 5.5); 
		System.out.println(sum02);
		
		double sum03 = MyMath.plus(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = MyMath.plus(20, 99.9);
		System.out.println(sum04);
		
		double sum05 = MyMath.circleArea(5);
		System.out.println(sum05);
		
		double sum06 = MyMath.circle(5);
		System.out.println(sum06);
		
	}
}
