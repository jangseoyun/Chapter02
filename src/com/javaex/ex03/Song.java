package com.javaex.ex03;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	

	//메소드
	public void setTitle(String t) {
		title = t;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public void setAst(String ast) {
		artist = ast;
	}
	
	public String getArt() {
		return artist;
	}
	
	
	public void setAlb(String alb) {
		 album = alb;
	}
	
	public String getAlb() {
		return album;
	}
	
	
	public void setCsr(String csr) {
		composer = csr;
	}
	
	public String getCsr() {
		return composer;
	}
	
	
	public void setYear(int yr) {
		year = yr;
	}
	
	public int getYear() {
		return year;
	}
	
	
	public void setTrack(int tr) {
		track = tr;
	}
	public int getTrack() {
		return track;
	}
	
	
	public void showinfo () {
		System.out.println(artist+","+title+" ("+album+","+year+","+track+"번 track,"+composer+" 작곡)");
	}
	
}
