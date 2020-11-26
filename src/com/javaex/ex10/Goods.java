package com.javaex.ex10;

public class Goods {
	//static
	
	//필드
	private String name;
	private int price;
	
	public static int totalCount; //int 기본값=0
	//생성자가 이용될 때마다 숫자 올리기.
	//1.모든 생성자에 totalCount=totalCount+1; 넣기 : 매번 새로운 totalCount를 쓰기 때문에 값이 변하지 않음.
	//2.totalCount 공유하기 --> 공통으로 써야 하는 변수나 값을 스태틱 영역에 둬서 어디서든 접근할 수 있도록 함.
	//3.메모리에 올리기 전에 static을 먼저 찾아서 '스태틱' 영역에 해당 변수를 잡아둠. --> 전역 변수
	//4.인스턴스(우리가 정한 이름 카메라 등)이 생기기 전에 올라가는 거라 Goods.totalCount 이렇게 클래스명으로 씀.
	//사실 스태틱에는 변수에 값 저장하는 거 위험성이 있어서 잘 안 씀. 작동이 안 되도 문제없는 기능을 주로 넣음.
	
	
	//생성자
	public Goods() {
		totalCount=totalCount+1;
	}
	public Goods(String name) {
		this.name=name; //이 변수는 이 생성자에서만 쓸 수 있음. 지역변수.
		totalCount=totalCount+1;
	}
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		totalCount=totalCount+1;
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
	public int getTotalCount() {
		return totalCount;
	}

	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품명: "+name+", 가격: "+price);
	}
	
	
	//테스트 : totalCount 추가 이후 toString 다시 만들면 필드 추가돼 있음.
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}
	

	
	
	
}
