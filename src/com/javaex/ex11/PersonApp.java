package com.javaex.ex11;

public class PersonApp {
	//필드
	
	//생성자
	
	//메소드 g,s
	
	//메소드 일반
	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", 45);
		
		Person p02 = new Person("이정재", 46);
		/*
		Person p02 = new Person();
		p02.setName("이정재");
		p02.setName(46);
		*/
		
//		System.out.println(p01.toString());
//		System.out.println(p02.toString());
		p01.showinfo();
		p02.showinfo();
		
		//Student Person상속 받고 테스트
		Student s01 = new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("아형고등학교");
		
		System.out.println(s01.getName()); 
		System.out.println(s01.getAge()); 
		System.out.println(s01.getSchoolName());
		
		//Student에 파라미터가 3개인 생성자를 만들어준다.
		Student s02 = new Student("서장훈", 50, "강남고등학교");
		s02.showinfo();
		
		System.out.println(s02.toString());
		
//		Student s03 = new Student("강남고등학교");
//		
//		System.out.println(s01.toString());
	}

}
