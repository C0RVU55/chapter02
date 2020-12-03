package com.javaex.ex19;

public class Triangle extends Shape implements Drawable{
	
	//필드
	private int b;
	private int h;
	
	//생성자
	public Triangle(String fillColor, String lineColor,int b, int h) {
		super(fillColor,lineColor);
		this.b=b;
		this.h=h;
	}
	
	//메소드 겟셋
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	//메소드 일반
	@Override
	public void draw() {
		System.out.println("삼각형-면색:"+fillColor+" | 선색:"+lineColor+" | 밑변:"+b+" | 높이:"+h);

	}

	@Override
	public double area() {
		return 0.5*b*h;
	}

}
