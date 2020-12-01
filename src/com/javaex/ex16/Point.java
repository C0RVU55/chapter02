package com.javaex.ex16;

public class Point {
	//메소드 오버라이딩 복습
	
	//필드
	protected int x;
	protected int y;
	
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
	public void showInfo() {
		System.out.println("점[x= "+x+", y= "+y+"]을 그렸습니다.");
	}
}
