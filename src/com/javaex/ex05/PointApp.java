package com.javaex.ex05;

public class PointApp {
	public static void main(String[] args) {
		//생성자 Goods()
		//setter 사용
		//showInfo() 확인
		
		Point p1=new Point();
		p1.setX(5);
		p1.setY(6);
		p1.draw();
		
		
		//생성자 Goods(String name, int price)
		//setter 사용X
		//draw 확인
		
		Point p2=new Point(3, 8);
		p2.draw();
		
		//생성자 Goods(String name)
		//setter 사용 setPrice();
		//draw 확인
		
		Point p3=new Point(7);
		p3.setY(2);
		p3.draw();
		
		//Point(int y) 생성자 사용
		//setX() 사용
		//draw 확인
	}
}
