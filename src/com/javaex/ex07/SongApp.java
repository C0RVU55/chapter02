package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		// 메소드 오버로딩 테스트
		
		//생성자0
		//setter 6개 사용
		//showinfo()
		Song s00=new Song();
		s00.setTitle("좋은날");
		s00.setArtist("아이유");
		s00.setComposer("이민수");
		s00.setAlbum("Real");
		s00.setYear("2010");
		s00.setTrack(3);
		
		//System.out.println(s00.toString());
		s00.showInfo();
		
		//Song(파라미터 6개) 생성자 사용
		//setter 사용X
		//showInfo()
		Song s01=new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", "2007", 2);
		
		//System.out.println(s01.toString());
		s01.showInfo();
		
		//Song(파라미터 2개) 생성자 사용
		//setter 사용
		//showInfo()
		Song s02=new Song("벚꽃엔딩", "버스커버스커");
		s02.setAlbum("버스커버스커1집");
		s02.setComposer("장범준");
		s02.setYear("2012");
		s02.setTrack(2);
		
		//System.out.println(s02.toString());
		s02.showInfo();
	}

}
