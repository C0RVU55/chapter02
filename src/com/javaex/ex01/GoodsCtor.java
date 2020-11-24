package com.javaex.ex01;

public class GoodsCtor {
	//setter없이 생성자로만 쓰기.
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public GoodsCtor(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품명: "+name+"\n가격: "+price);
	}
}
