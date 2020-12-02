package com.javaex.ex18;

public class Circle extends Shape{
	//필드
	private int radius;
	
	//생성자
	public Circle() {}
	public Circle(String fillColor, String lineColor, int radius) {
		super.fillColor=fillColor;
		super.lineColor=lineColor;
		this.radius=radius;
	}
	
	//메소드 겟셋
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	public void draw() {
		System.out.println("원-면색:"+fillColor+" 선색:"+lineColor+" 반지름:"+radius);
	}
	//부모추상클래스에 있는 일반 추상 메소드 전부 쓰기.
	public double area() {
		return 3.14*radius*radius;
	}
}
