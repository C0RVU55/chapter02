package com.javaex.ex12;

public class Goods {
	// Goods 관리를 위한 배열
	
	//필드
	private String name;
	private int price;
	
	
	//생성자 : 기본생성자 삭제됨.
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
	}

	//메소드 겟셋
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품명: "+name+", 가격: "+price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
}
