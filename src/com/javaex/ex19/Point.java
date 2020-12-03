package com.javaex.ex19;

public class Point implements Drawable {
	//인터페이스
	
	/*
	만약에 Shape를 상속받는 클래스가 fillColor, lineColor가 필요없고 추상메소드 2개 중 하나만 쓸 경우
	쓰지도 않을 필드와 메소드까지 다 상속받으면 비효율적이니까 인터페이스를 씀. --> 메소드 제목만 씀.
	도형끼리 묶고(추상클래스로 상속) 그리기 기능끼리 묶음(인터페이스로 상속). --> 면적이 있는 자식클래스와 그리기 기능을 쓰는 클래스로 새로 묶음.
	
	인터페이스는 클래스가 아니고 implements(구현)로 연결함. --> 인터페이스에 제목만 있는 draw를 여기에서 채워야 됨.
	*/
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//메소드 겟셋
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void draw() {
		System.out.println("점 x="+x+", y="+y);
	}
	
	
}
