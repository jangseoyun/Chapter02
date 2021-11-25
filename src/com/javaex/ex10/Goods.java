package com.javaex.ex10;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {
		//디폴트
	}

	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	//메소드 g,s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

		
	//메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	public void showinfo() {
		System.out.println("상품명: "+name);
		System.out.println("가격: "+price);
		System.out.println("--------------------");
	}
	
	
	
	
	
	
}
