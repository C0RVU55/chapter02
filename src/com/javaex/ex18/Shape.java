package com.javaex.ex18;

public abstract class Shape {
	//추상클래스
	
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
	//draw 아직 못 만듦
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	//메소드 오버라이딩할 거라 껍데기만 써도 됨.
	public abstract void draw(); 
	public abstract double area();
	//오버라이딩용으로 쓰는 출력메소드. 
	//메소드만 추상화시킬 수 있긴 한데 Shape 클래스 선언해서 .draw할 수도 있으니까 아예 메소드에 abstract가 있는 클래스는 클래스자체를 추상클래스로 만들어버리는 게 안전함.
	//메소드에 abstract가 있는 클래스는 불완전한 클래스이기 때문.
	
	//근데 어차피 위처럼 메소드 오버라이딩될 거니까 이 Shape는 가상의 분류 개념으로 쓰고 메모리에 독단적으로 올라가면 오류나게 하게 할 수 있음.
	//클래스명에 public abstract class Shape 이렇게 추가하면 Shape s01=new Shape() 이러면 오류남. 추상 클래스를 단독으로 메모리에 올릴 수 없음.
	//Shape c01=new Circle 이렇게 섞어쓰기로만 가능.
	
	
}
