package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		// Goods 관리를 위한 배열
		//(1)
		Goods[] goodsArr=new Goods[3]; //주소를 따라가보면 메모리에 올라온 틀 Goods에 가도록 함.
		
		//(2)(3)(4)
		Goods camera=new Goods("니콘", 400000);
		Goods computer=new Goods("LG그램", 1000000);
		Goods cup=new Goods("머그컵", 2000); 
		
		//(5)(6)(7)
		goodsArr[0]=camera; //메모리에 올라온 틀의 주소값이 배열에 들어간 거. 진짜 틀이 들어가 있는 게 아님.
		goodsArr[1]=computer;
		goodsArr[2]=cup;
		
		System.out.println(camera.getName());
		System.out.println(goodsArr[0].getName());
		
		for(int i=0; i<goodsArr.length; i++) {
			/*
			System.out.println(goodsArr[i].getName());
			System.out.println(goodsArr[i].getPrice());
			*/
			System.out.println(goodsArr[i].toString()); //테스트도 가능
			goodsArr[i].showInfo(); //그냥 쭉 출력하는 게 아니라 꾸며놨다면 이걸 그대로 적용 가능.
		}
		
		//값 바꾸기 --> 같은 곳을 가리키고 있음.
		cup.setPrice(9000);
		goodsArr[2].setName("유리컵"); //모든 틀의 이름들을 관리하기 힘드니까 배열에 넣어서 관리함. 틀이름말고 배열 위치로도 변경 가능.
		System.out.println(goodsArr[2].getPrice());
		System.out.println(goodsArr[2].getName());
		
		//외부에서 프로젝트 가져오기 --> workspace에 복사파일 넣고 이클립스에서 file --> import --> browse 이렇게 찾으면 됨.
		//근데 자바 파일 몇 개 가져오는 게 아니라 꼭 이클립스에서 작업하던 프로젝터여야 함.

	}

}
