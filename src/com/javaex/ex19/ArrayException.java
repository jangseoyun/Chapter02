package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {3,6,9};
		/*
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		*/
		
		//부모를 선언해서 잡는것 (여러개의 상황이 동시에 발생)
		//e의 변수명이 동일하게 가능한경우는 (e발생){}가 끝나면 사라진다
		try {
			System.out.println(intArray[3]); //없는 공간 강제 종료 
		}catch(ArrayIndexOutOfBoundsException e) {// 상황 처리 
			System.out.println(e.toString());
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}finally {//생략가능
			System.out.println("finally영역"); //에러상황 발생여부와 관계없이 처리됨
		}
		
		//부모를 선언해서 잡는것 (여러개의 상황이 동시에 발생)
		try {
			System.out.println(intArray[3]); //없는 공간 강제 종료 
		}catch(Exception e) {// 상황 처리 
			System.out.println(e.toString());
		}finally {//생략가능
			System.out.println("finally영역"); //에러상황 발생여부와 관계없이 처리됨
		}

	}
}
