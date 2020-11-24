package com.javaex.ex03;

public class Song {
	//필드 : 대충 해봤는데 이렇게 써도 되긴 함.
	private String title, artist, album, composer;
	private int year, track;
	/*
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year; //날짜는 문자열로 넣기 
	private int track;
	*/
	
	//생성자 : 문법은 메소드와 유사한데 클래스 이름을 써야 되고 return값이 없음(자료형 안 써도 됨).
	//↓메모리에 올리는 역할. 안 써도 알아서 만들어져서 작동함. 새 생성자를 만들고 기본 생성자도 써야할 경우에는 써줘야 됨.
	public Song(){}
	
	public Song(String title, String artist, String album, String composer, int year, int track) { //받고 싶은 파라미터를 넣음.
		this.title=title; //받은 값을 (메모리에 올라간) 해당변수에 넣음.
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	
	//메소드-게터/세터 (게터끼리 모으지 말고 한 변수의 게터세터 같이 쓰기)
	public void setTitle(String title) {
		this.title=title;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setTrack(int track) {
		this.track=track;
	}
	
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	
	/*위와 같은 단순반복작업을 이클립스가 도와줌. alt+shift+s(소스탭) --> generated getters and setters
	--> 필드 다 선택하고 generate --> getter/setter 자동 생성*/
	//ctrl+shift+f --> 코드 정렬
	
	//메소드 일반
	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡"+")");
	}

	
}
