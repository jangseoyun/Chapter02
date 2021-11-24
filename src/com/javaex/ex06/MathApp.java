package com.javaex.ex06;

public class MathApp {

	public static void main(String[] args) {
	
		//필드
		
		//생성자
		
		//메소드 g/s
		
		//메소드 일반
		/*
		 case 1
		Math math = new Math();
		System.out.println(math.plusInt(3,2));
		System.out.println(math.plusDouble(34.2, 27.4));
		*/
		
		
		//case 2 (int만, double만, 3~4번을 넣음으로서 전부다 가능)ㄴ
		Math math = new Math();
		System.out.println(math.plus(3,2));
		System.out.println(math.plus(34.2, 27.4));
		System.out.println(math.plus(3, 27.4));
		System.out.println(math.plus(27.4, 2));
	}

}
