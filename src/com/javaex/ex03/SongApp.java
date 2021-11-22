package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song();
		iu.setAst("아이유");
		iu.setTitle("좋은날");
		iu.setAlb("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setCsr("이민수");
		iu.showinfo();
		
		Song bigbang = new Song();
		bigbang.setAst("BIGBANG");
		bigbang.setTitle("거짓말");
		bigbang.setAlb("Always");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setCsr("G-DRAGON");
		bigbang.showinfo();
		
		
		Song busker = new Song();
		busker.setAst("버스커버스커");
		busker.setTitle("벚꽃엔딩");
		busker.setAlb("버스커버스커1집");
		busker.setYear(2012);
		busker.setTrack(4);
		busker.setCsr("장범준");
		busker.showinfo();

	}

}
