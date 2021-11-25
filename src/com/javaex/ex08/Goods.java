package com.javaex.ex08;

public class Goods {
	// 필드
	private String name;
	private int price;
	private static int totalCount;

	// 생성자
	public Goods() {
		this.totalCount++;

	}

	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		this.totalCount++;
	}
	// 메소드 g,s

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

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}

}
