package com.javaex.ex19;

import java.util.Scanner;

public class ArithException {
	
	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		result = 100/num; //런타임에러)num이 0이 될 수 없다.에러남 0을 넣어야 알 수 있다. (예외상황)
		System.out.println(result);
		
		/*if문 사용
		if(num!=0) {
			result = 100/num; //런타임에러)num이 0이 될 수 없다.에러남 0을 넣어야 알 수 있다. (예외상황)
			System.out.println(result);
		}else {
			System.out.println("계산할 수 없습니다");
		}*/
		
		sc.close();
	}
	
}
