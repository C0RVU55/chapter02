package com.javaex.ex14;

public class PointApp {

	public static void main(String[] args) {
		// 클래스 상속관계
		
		Point p=new Point(4,4);
		//실행 순서 : 부모(본인)생성자(2) --> Point(2)
		
		ColorPoint p1=new ColorPoint("red");
		//실행순서 : 부모기본생성자 - 자식생성자(1) --> Point() ColorPoint(1)
		
		ColorPoint p2=new ColorPoint(10,10,"blue");
		//실행순서 : 부모생성자(2) - 자식생성자(3)(부모필드와 자식필드를 같이 메모리에 올리고 변수도 합친 상태) --> Point(2) ColorPoint(3) 
		
		p.showInfo();
		p1.showInfo();
		p2.showInfo();
		
		/* 스태틱
		 * -------------------------------------------------------------------
		 * 스택	p□0x111			p1□0x222			p2□0x333
		 * -----│---------------│-------------------│-------------------------
		 * 힙	│				│					│
		 * 		□0x111 Point	□0x222 ColorPoint	□0x333 ColorPoint extends Point
		 * 		int x;			String color		*Point			
		 * 		int y;			...					int x;
		 * 		...									int y;
		 * 											...
		 * 											------
		 * 											*ColorPoint extends Point
		 * 											String color
		 * 											...
		 * 											public ColorPoint(int x, int y, String color){
		 * 												super(x,y);
		 * 												this.color=color;	}
		 * 											...
		 * 											public void showInfo(){
		 * 												System.out.println("x="+x+" y="+y+" 색: "+color);	}
		 * 												(*부모필드의 접근제한자 protected여야 변수 끌어다 사용가능*)
		 */

	}

}
