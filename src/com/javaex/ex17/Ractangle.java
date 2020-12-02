package com.javaex.ex17;

public class Ractangle extends Shape{

	//추상클래스
	
	//필드
	/* 부모클래스로 일반화하는 중 --> 여기에 안 하고 그냥 패키지18에 함.
	private String fillColor;
	private String lineColor;
	*/
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {}
	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor,lineColor);
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
	
	//메소드 일반 draw 나중에
	@Override
	public String toString() {
		return "Ractangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	public void draw() {
		System.out.println("사각형-면색:"+fillColor+" 선색:"+lineColor+" 가로:"+width+" 세로:"+height);
	}
	
	
	
}
