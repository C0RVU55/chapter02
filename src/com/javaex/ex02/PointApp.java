package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// 새 클래스
		
		Point p1=new Point();
		/*
		p1.x=2;
		p1.y=2;
		*/
		
		//캡슐화해서 메소드 만들기.
		//p1 p2 p3 p4
		
		p1.setXpoint(0);
		p1.setYpoint(0);
		
		//int p1x=p1.getXpoint();
		//int p1y=p1.getYpoint(); 새 변수에 넣고 출력하는 게 아니라 출력메소드를 만들 거니까 굳이 변수선언할 필요없음.
		p1.draw();
		
		Point p2=new Point();
		p2.setXpoint(0);
		p2.setYpoint(5);
		p2.draw();
		
		Point p3=new Point();
		p3.setXpoint(5);
		p3.setYpoint(5);
		p3.draw();
		
		Point p4=new Point();
		p4.setXpoint(5);
		p4.setYpoint(0);
		p4.draw();
		
	}

}
