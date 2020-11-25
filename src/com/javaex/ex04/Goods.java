package com.javaex.ex04;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자 - 메모리에 올림 
	// constructor overloading : 다른 조합의 파라미터(자료형, 개수, 순서)로 같은 이름인 생성자 여러개 만들어서 골라 쓸 수 있음. (파라미터가 다르지만 다 같은 생성자로 취급함???)
	
	//기본생성자 생성 : alt+shift+s --> generate constructor using fields --> 다 체크 풀고 만들면 기본생성자 생김. 필드 골라서 체크 가능.
	 
	public Goods() {} 
	// ***기본생성자는 다른 생성자가 있으면 생략 불가능***
	// 코드 넣을 거 없으니까 중괄호 위치 이렇게 쓰기도 함.

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Goods(String name) {
		this.name = name;
	}

	// 메소드 getter/setter
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

	// 메소드 일반
	public void showInfo() {
		System.out.println("상품명: "+name+", 가격: "+price);
	}
}
