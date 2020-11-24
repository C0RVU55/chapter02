package com.javaex.ex03;

public class SongCtor {
	//Song 생성자로 쓰기
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year; 
	private int track;
	
	//생성자
	public SongCtor(String title, String artist, String album, String composer, String year, int track) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡"+")");
	}

	
}
