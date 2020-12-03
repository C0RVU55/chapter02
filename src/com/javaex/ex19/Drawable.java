package com.javaex.ex19;

public interface Drawable {
	
	//인터페이스 파일
	
	//new > interface로 만들고 작명은 대체로 -able임.
	//버전이 바뀌면서 인터페이스에 필드를 넣는 경우도 생겼지만 대체로 메소드 제목만 나열함.
	//클래스가 아니기 때문에 public abstract void draw(); 이렇게 쓰면 안 됨.
	
	public void draw(); //부모에 해당되는 부분.
}
