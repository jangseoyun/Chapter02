package com.javaex.ex01;

public class Goods {
	//틀
	//필드
	private String name;
	private int price;
	
	//생성자

	//메소드
	public void setName(String name) {
//		name = n;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		
//		price = p;
		this.price = price;
	}
	
	public int getPrice() {
		return price;//밖으로 내보내기
		
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name); //name 전체
		System.out.println("가격:" + price); //price 전체
		System.out.println("----------------");
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	

}
