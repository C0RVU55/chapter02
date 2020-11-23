package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// 만들어둔 클래스를 어떻게 쓸 지 스토리를 짜는 클래스.
		
		Goods camera = new Goods();
	/*  3￣￣ 2￣￣￣  1￣￣￣￣￣
	 * 클래스 호출
	 *  1. new로 class를 메모리에 올림.
	 *  2. 메모리에 올라온 class에 접근하기 위한 변수명(주소).
	 *  3. 변수를 위한 자료형 선언. 동명의 class명이 자료형이 됨.
	 */
		
		/*캡슐화 때문에 사용 불가
		camera.name="니콘"; 
		camera.price=400000;
		
		//클래스 항목에 값 넣기 
		//--> 실제 Goods 클래스에 값을 넣는 게 아니라 메모리에 올라와 있고 camera로 접근한 클래스에 값을 넣는 거.
		//틀에는 직접 값을 넣을 수 없고 메모리에 올린 클래스에 값을 넣어서 쓰는 거.
		
		//값이 잘 들어갔나 출력해보기
		System.out.println(camera.name);
		System.out.println(camera.price);
		//System.out.println(camera); 이거 출력하면 대입된 클래스 주소가 뜨는듯?
		
		//컴퓨터
		Goods computer=new Goods();
		computer.name="LG그램";
		computer.price=1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		//머그컵
		Goods mug=new Goods();
		mug.name="머그컵";
		mug.price=2000;
		
		System.out.println(mug.name);
		System.out.println(mug.price);
		
		//값 바꾸기
		camera.price=450000;
		System.out.println(camera.price);
		*/
		
		//카메라
		camera.setName("니콘"); //값 등록
		String name=camera.getName(); //값 불러오기
		System.out.println(name); //이렇게 복잡하게 하는 이유는 정확한 값을 넣기 위함.
		
		camera.setPrice(400000);
		int price=camera.getPrice();
		System.out.println(price);
		
		//컴퓨터
		Goods computer =new Goods();
		
		computer.setName("LG그램");
		System.out.println(computer.getName()); //이대로 넣어도 출력되긴 하는데 변수 선언하는 게 알아보기 쉬움.
		
		computer.setPrice(1000000);
		int comPrice=computer.getPrice();
		System.out.println(comPrice);
		
		//머그컵
		Goods cup=new Goods();
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		String mName=cup.getName();
		int mPrice=cup.getPrice();
		
		System.out.println(mName);
		System.out.println(mPrice);
		
		/*
		만들어 놓은 class(값대입하고 어쩌구하는 거에 영향 안 받음. 그냥 틀임.)
		---------
		Goods 
		---------
		String name;
		int price;
		---------
		
		메모리
				
		스태틱
		
		-------------------------------------------------------------------------
				int num
		스택    □4         Goods camera          Goods computer
		   				   □0x123                □0x555  <--주소만 가지고 있고 실제데이터는 힙영역에 있음.
						   │                     │
		 				   │                     │
		-------------------│---------------------│-------------------------------
						   │                     │
		힙				 □0x123 Goods            □0x555 Goods         <--메모리에 올라온 class(이걸로 작업함.)
		(실제데이터      String name=camera;     String name=computer;
		저장 영역)       int price=400000;       int price=1000000;
		
		*/
		
	}

}


