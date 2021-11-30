package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("정우성",45);
		p01.showinfo();
		
		
		Student s01 = new Student("정우성",46,"강남고등학교");
		s01.showinfo(); //재정의 
		
		//섞어쓰기(오버라이드)
		Person ps01 = new Student("강호동",50,"마산고등학교");
		ps01.showinfo();
		System.out.println(ps01.toString());
		
	}

}
