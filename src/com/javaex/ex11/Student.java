package com.javaex.ex11;

public class Student extends Person {
	// 필드
	private String schoolName;

	// 생성자
	public Student() {

	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	//모에 있는 생성자까지 포함하여 일괄하여 적용 가능하도록 작성해주는 방법
	//name , age는 부모쪽에 있음 : super.로 불러준다.
	public Student(String name, int age, String schoolName) {
		//부모 생성자 실행 super();
//		super(); //부모디폴트 생성자를 사용할 때
		
		//파라미터를 넣으면 2개 생성자 사용할 수 있음
		super(name,age);
//		
		//부모 필드에서 protected 접근자 사용시에는 상속받은 클래스에서 사용이 가능하다.
//		super.name = name;
		
		super.setName(name);//위 person(2) 넣으면 없어도됨
		super.setAge(age);//위 person(2) 넣으면 없어도됨
		this.schoolName = schoolName;
		
		System.out.println("Student(3)");
	}

	// 메소드 g,s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	// 메소드 일반
	/*@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}*/
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + name + ", age=" + age + "]";
	}

	
	
	public void showinfo() {
		System.out.println("*********************");
		System.out.println("이름:"+super.name); //name, this.name 도 가능 상속이라서
		System.out.println("나이:"+super.age);//age, this.age 도 가능 상속이라서
		System.out.println("학교:"+this.schoolName);
		System.out.println("*********************");
		System.out.println("");
	}

	
	

}
