package com.javaex.ex18;

public class Ractangle extends Shape { 
	//여기 area() 안 쓰면 오류뜨는데 자식클래스에 (부모에 써놓은)일반 추상 메소드 구현하라고 뜨는 거. Shape 안에 있는 거 쓰지 말라고.
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {}
	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor); //this.fillColor해도 상속 간에 안 겹치는 변수라 가능. 근데 super.fillColor 이렇게 해도 됨. 
		this.width=width;
		this.height=height;
	}
	
	//메소드 겟셋
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	public void draw() {
		System.out.println("사각형-면색:"+fillColor+" 선색:"+lineColor+" 가로:"+width+" 세로:"+height);
	}
	//부모추상클래스에 있는 일반 추상 메소드 전부 쓰기.
	public double area() {
		//double area=width*height --> area변수 선언해서 넣은 건데 굳이 이럴 필요 없음.
		return width*height;
	}
}
