package com.javaex.ex01;

public class Goods {
	//실행할 게 아니라서 public static void main 안 씀.
	//이 틀이 있으면 이걸 어떻게 돌릴지 메인스토리를 생각해야 됨.
	
	//필드
	private String name; 
	private int price; 
	
	//접근자(캡슐화 정보은닉) : publics > protected > (default) 아무것도 안 쓴 상태. > private
	/*private --> 캡슐화 : 메모리에 올라온 클래스에 접근 불가능. 직접 값대입도 안 되고 출력도 안 됨.
	 *안전(필드 보호)을 위해 변수에 직접 대입하는 게 아니라 메소드에 넣으면 메소드가 변수에 값대입해줌.*/
	
	
	
	//생성자
	//메소드-getter/setter
	
	//메소드-일반 : 정의 방식과 호출 방식이 다름.
	//name 등록하는 기능 : setName()
	public void setName(String n) { //그릇으로 받을 값은 문자열이고 변수는 n으로 하나 잡아 놓은 거.
		name=n; 
	}
	/*
	private "니콘" "LG그램" "머그컵" 등 같은 클래스 안에서는 값 대입 가능.
	setter에 값을 넣으면 저장만 됨.
	return 필요할 때만 씀. 생략 가능. 리턴이 필요할 때 리턴값에 맞춰서 'public 자료형 -' 쓰는 거.
	리턴이 없으면 자료형도안 써도 되는데 자료형 자리는 지켜줘야 돼서 대신 void 씀.
	*/
	
		
	//name 읽어주는 기능 : getNAme()
	public String getName() { //그냥 읽어오는 거고 줄 게 없으니까 파라미터값 없이 괄호만 침.
		return name; //setter의 값(읽어온 값)을 밖으로 내보낼 수 있도록함.
	}
	
	//price 등록하는 기능 : setPrice()
	public void setPrice(int p) { //리턴 안 할거면 다 void 쓰는듯.
		price=p;
	}
	
	//price 읽어주는 기능 : getPrice()
	public int getPrice() { //대답할 때 뭐로 대답할지 자료형 쓰는 거.
		return price;
	}
	

}
