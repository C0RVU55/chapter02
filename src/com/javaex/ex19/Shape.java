package com.javaex.ex19;

public abstract class Shape {
	
	//Shape : 추상클래스+부모클래스
	
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {}
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 겟셋
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	// public abstract void draw(); 인터페이스에 넣을 거라(개념이동) 여기 있을 필요없음.
	public abstract double area();
	
}
	
