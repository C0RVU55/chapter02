package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		// 추상클래스 복습
		
		/*
		1.Shape(추상클래스)를 부모로 하는 자식클래스 Circle, Ractangle 만들기
		2.부모메소드에 abstract 붙이고 자식메소드로 오버라이딩시켜서 외형과 면적 출력하기
		3.자식클래스를 부모클래스형 배열에 넣고 (오버라이딩된)출력메소드 쓰기
		*/
		
		//배열 선언
		Shape[] shape=new Shape[5];
		
		//변수(클래스) 선언
		Shape r1=new Ractangle("파랑","초록",20,5);
		Shape r2=new Ractangle("노랑","빨강",5,3);
		//System.out.println(r1.toString());
		Shape c1=new Circle("검정","파랑",5);
		Shape c2=new Circle("보라","하늘",7);
		//System.out.println(c1.toString());
		Shape t1=new Triangle("연두","주황",5,6);
		
		//배열에 넣기
		shape[0]=r1;
		shape[1]=r2;
		shape[2]=c1;
		shape[3]=c2;
		shape[4]=t1;
		
		//출력
		for(int i=0; i<shape.length; i++) {
			shape[i].draw();
			System.out.println("면적:"+shape[i].area());
		}
		
	}

}
