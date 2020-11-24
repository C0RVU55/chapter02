package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		//객체지향
		
		//해설 : 변수 song01, song02, song03
		
		//Song aiu=new Song(); //Song() <-- 생성자
		Song bigbang=new Song(); //생성자1 사용
		Song busker=new Song();
		
		Song aiu=new Song("좋은날", "아이유", "Real", "이민수", 2010, 3); //<-- 생성자2 사용
		//위처럼 한번에 넣는 식으로 표기해도 되는데 setter로 값을 대입한 게 아니라 생성자로 대입됨.
		//class에 생성자로 만들어 줘야 위와 같은 형태를 쓸 수 있음.
		
		/*
		aiu.setAlbum("Real");
		aiu.setArtist("아이유");
		aiu.setComposer("이민수");
		aiu.setTitle("좋은날");
		aiu.setTrack(3);
		aiu.setYear(2010);
		*/
		aiu.showInfo(); //생성자로 해도 출력은 똑같이 되긴 함.
		
		//생성자2 트랙번호 변경 후 확인 : 바뀐 값으로 출력.
		aiu.setTrack(345);
		aiu.showInfo();
		
		
		bigbang.setAlbum("Always");
		bigbang.setArtist("BIGBANG");
		bigbang.setComposer("G-DRAGON");
		bigbang.setTitle("거짓말");
		bigbang.setTrack(2);
		bigbang.setYear(2007);
		bigbang.showInfo();
		
		busker.setAlbum("버스커버스커1집");
		busker.setArtist("버스커버스커");
		busker.setComposer("장범준");
		busker.setTitle("벚꽃엔딩");
		busker.setTrack(4);
		busker.setYear(2012);
		busker.showInfo();
		
		//생성자1 트랙번호 변경 후 확인 : 바뀐 값으로 출력.
		busker.setTrack(234);
		busker.showInfo();
		

	}

}
