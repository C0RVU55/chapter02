package com.javaex.ex07;

public class Song {
	//메소드 오버로딩 테스트 
	//순서는 상관없는데 보통 이렇게 씀 : 필드 생성자 메소드
	
	//필드 6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year; 
	private int track;
	
	//생성자0
	public Song() {
		
	}
	
	//생성자2 타이틀 트랙번호
	public Song(String title, int track) {
		this.title=title;
		
		if(track<1) { //복잡한 로직이 있을 수 있음.
			this.track=0; //음수면 0으로 처리함.
		}else {
			this.track=track;
		}
		
		System.out.println("생성자2");
		
	}
	
	//생성자6
	public Song(String title, String artist, String album, String composer, String year, int track) {
		//같은 클래스 안에서 다른 생성자 호출 : this() --> 이 안에 호출하려는 생성자의 파라미터를 써줘야 함.
		//타이틀, 트랙은 위 생성자에서 잘 돌아가고 있다고 가정하고 그 생성자에서 갖다쓰고 나머지 4개는 여기에 써줌.
		this(title, track); //다른 this. 뒤에 넣으니까 오류남. 호출생성자는 먼저 써야되나 봄. 호출생성자에 가서 일하고 여기로 돌아오게됨.
		
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		
		System.out.println("생성자6");
	}

	//생성자2 타이틀 아티스트
	public Song(String title, String artist) {
		this.title=title;
		this.artist=artist;
	}
	
	//생성자2 타이틀 작곡가 비교해보기(파라미터가 위처럼 String 2개라 자료형 중복돼서 못 만듦) <--자료형, 개수, 순서 다 겹쳐야 중복.
	/*
	public Song(String title, String composer) {
		this.title=title;
		this.composer=composer;
	}
	*/
	

	
	//메소드 - getter/setter
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	
	//메소드 일반 showInfo()
	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡"+")");
	}
	
	//메소드 일반 toString() <-- 테스트
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
}
