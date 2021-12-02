package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {
	
	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//예외상황
		try {
			//예외가 발생한 곳
			result = 100/num; //런타임에러)num이 0이 될 수 없다.에러남 0을 넣어야 알 수 있다. (예외상황)
			System.out.println(result);
		}catch(ArithmeticException e) {//0으로 나누는 상황(예외상황일때 처리할 로직)
			System.out.println("chtch영역");
		}finally {
			//예외 발생 여부와 관계없이 처리됨
			System.out.println("finally영역");
		}
		

		sc.close();
	}
	
}
