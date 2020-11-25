package com.javaex.ex05;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Point(int x) {
		this.x=x;
	}
	/*위 생성자랑 중복됨. 파라미터의 값은 구별 못하고 자료형+개수+순서를 구별함. 그래서 아래 거는 위와 똑같은 생성자로 인식함.
	public Point(int y) { 
		this.y=y;
	}
	*/
	
	//메소드 getter/setter
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
	public void draw() {
		System.out.println("점[x= "+x+", y= "+y+"]을 그렸습니다.");
	}
}
