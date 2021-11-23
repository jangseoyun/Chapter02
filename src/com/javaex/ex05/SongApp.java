package com.javaex.ex05;

public class SongApp {
	//필드
	
	//생성자
	
	//메소드 getter setter
	
	//메소드 일반

	public static void main(String[] args) {
	
		Song s01 = new Song("아이유","좋은날","Real",2010,3,"이민수");
		s01.showlnfo();
//		System.out.println(s01.toString());
		
		Song s02 = new Song("BIGBANG", "거짓말", "Always", 2007, 2, "G-DRAGON");
		s02.showlnfo();
//		System.out.println(s02.toString());
		
		Song s03 = new Song();
		s03.setAlbum("버스커버스커1집");
		s03.setArtist("버스커버스커");
		s03.setTitle("벚꽃엔딩");
		s03.setComposer("장범준");
		s03.setTrack(4);
		s03.setYear(2012);
		s03.showlnfo();
//		System.out.println(s03.toString());

	}

}
