package com.javaex.ex09;

public class MyMath {

	// 필드 -- 필요 없음
	private static double PI;

	// 생성자
	// 디폴트 생성자(컴파일러가 자동으로 생성)

	// 메소드 g,s -- 필드 없음

	// 메소드 일반
	public static int plus(int a, int b) { // 1번
//		int sum = a + b;
//		return sum;
		return a + b;
	}

	public static double plus(double a, double b) {// 2번
//		double sum = a+b;
//		return sum;
		return a + b;
	}

	public static double plus(double a, int b) {// 3번
//		double sum = a+b; //int가 double형으로 변경 3.5 + 3.0
		return a + b;
	}

	public static double plus(int a, double b) {// 4번
		return a + b;
	}

	public static double circleArea(int radius) {
		return radius * radius * 3.14;
	}
	
	public static double circle(int radius) {
		return (radius+radius)*PI;
	}
	
	
}
