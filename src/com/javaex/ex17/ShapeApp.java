package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		// 추상클래스
		
		//사각형 테스트
		/*
		Ractangle r00=new Ractangle("빨강","노랑",5,10);
		System.out.println(r00.toString());
		
		r00.draw();
		*/
		
		Ractangle r01=new Ractangle("빨강","노랑",5,10);
		Ractangle r02=new Ractangle("초록","파랑",20,40);
		Ractangle r03=new Ractangle("보라","군청",50,30);
		
		Ractangle[] rArr=new Ractangle[3];
		rArr[0]=r01;
		rArr[1]=r02;
		rArr[2]=r03;
		
		for(int i=0; i<rArr.length; i++) {
			rArr[i].draw();
		}
		
		//원 테스트 --> 후에 삼각형, 오각형 등 계속 추가될 가능성이 있으므로 이 배열들을 하나의 배열로 관리하고자 함.
		Circle c01=new Circle("파랑","파랑",5);
		System.out.println(c01.toString());
		c01.draw();
	}

}
