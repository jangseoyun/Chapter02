package com.javaex.ex03;

/**
 * @author hjj92
 *
 */
public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year; // 년월일을 표시하면 - 같은 특수문자가 들어갈 수 있기때문에 String도 고려
	private int track;

	// 메소드 getter or setter
	// 자동완성 단축키 alt + shift + s 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	//메소드 일반 

	public void showinfo() {
		System.out.println(
				artist + "," + title + " (" + album + "," + year + "," + track + "번 track," + composer + " 작곡)");
	}

	@Override 
	//보통 기본적으로 만들어 둠 (alt + shift + s > toString)
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	/*
	 * public void setTitle(String title) { // title = t; this.title = title; }
	 * 
	 * public String getTitle() { return title; }
	 * 
	 * 
	 * public void setAst(String ast) { artist = ast; }
	 * 
	 * public String getAst() { return artist; }
	 * 
	 * 
	 * public void setAlb(String alb) { album = alb; }
	 * 
	 * public String getAlb() { return album; }
	 * 
	 * 
	 * public void setCsr(String csr) { composer = csr; }
	 * 
	 * public String getCsr() { return composer; }
	 * 
	 * 
	 * public void setYear(int yr) { year = yr; }
	 * 
	 * public int getYear() { return year; }
	 * 
	 * 
	 * public void setTrack(int tr) { track = tr; } public int getTrack() { return
	 * track; }
	 */

}
