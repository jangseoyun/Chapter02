package com.javaex.ex07;

public class TvApp {

	public static void main(String[] args) {
		//필드
		
		//생성자
		
		//메소드 g/s
		
		//메소드 일반 //채널 볼륨 파워
		Tv tv = new Tv(35, 55, false);
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();

	}

}
