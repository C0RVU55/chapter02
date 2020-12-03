package com.javaex.ex19;

public class Circle extends Shape implements Drawable{ 
	//추상클래스랑 상속관계가 되면 부모클래스의 메소드 갖다쓰라고 오류가 나기 때문에 abstract 메소드를 먼저 옮기게 됨.
	
	//필드
	private int r;
	
	//생성자
	public Circle(String fillColor, String lineColor, int r) {
		super(fillColor,lineColor);
		this.r = r;
	}
	
	//메소드 겟셋
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

	public void draw() {
		System.out.println("원-면색:"+fillColor+" | 선색:"+lineColor+" | 반지름:"+r);
	}
	
	public double area() {
		return 3.14*r*r;
	}
	
}
