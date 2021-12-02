package com.javaex.ex20;

import java.io.IOException;

public class FileManager {
	//필드
	
	//생성자
	//public FileManager() {}
	
	//메소드 g,s
	
	//메소드 일반
	public void readFile() throws IOException{//c:config.txt 을 읽어오는 메소드 
		
		//System.out.println("파일을 읽었습니다.");

		System.out.println("강제 예외상황 발생");
		//원래 파일을 읽어 들이는 코드가 있어야함 
		throw new IOException(); //(상황을 강제로 만든 것)파일이 없어서 못읽었을 때 , input에러
		

	}
	
	
	
	
	
	
	
}
