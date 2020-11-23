package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	
	public void setXpoint(int xp) {
		x=xp;
	}
	public int getXpoint() { //getter는 app에서 새 변수에 값 대입할 거 아니면 없어도 되는 듯.
		return x;
	}
	
	public void setYpoint(int yp) {
		y=yp;
	}
	public int getYpoint() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
}
