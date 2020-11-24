package com.javaex.ex02;

public class PointCtor {
	//Point 생성자로 쓰기
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public PointCtor(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//메소드 일반
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
	
}
