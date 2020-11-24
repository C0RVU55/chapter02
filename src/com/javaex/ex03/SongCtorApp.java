package com.javaex.ex03;

public class SongCtorApp {

	public static void main(String[] args) {
		// Song 생성자로 쓰기 : 제목 가수 앨범 작곡가 연도 트랙
		
		SongCtor s01=new SongCtor("좋은날", "아이유", "Real", "이민수", "2010", 3);
		s01.showInfo();
		
		SongCtor s02=new SongCtor("거짓말", "BIGBANG", "Always", "G-DRAGON", "2007", 2);
		s02.showInfo();
		
		SongCtor s03=new SongCtor("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", "2012", 4);
		s03.showInfo();
		
	}

}
