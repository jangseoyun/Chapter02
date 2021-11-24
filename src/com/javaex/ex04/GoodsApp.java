package com.javaex.ex04;

public class GoodsApp {
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);
		camera.showinfo();
//		System.out.println(camera.toString());
		
		Goods computer = new Goods("LG그램", 900000);
		computer.showinfo();
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		cup.showinfo();
//		System.out.println(cup.toString());
		
		
	}

}
