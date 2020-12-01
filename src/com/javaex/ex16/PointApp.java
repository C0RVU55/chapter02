package com.javaex.ex16;

public class PointApp {

	public static void main(String[] args) {
		// 메소드 오버라이딩 및 업캐스팅 복습
		
		//배열1 : 부모클래스
		Point[] point0=new Point[3];
		
		Point p1=new Point(3,3);
		Point p2=new Point(2,3);
		Point p3=new Point(5,4);
		
		point0[0]=p1;
		point0[1]=p2;
		point0[2]=p3;
		
		//System.out.println(point0[0].toString());
		
		for(int i=0; i<point0.length; i++) {
			point0[i].showInfo();
		}
		
		System.out.println("-----배열2----");
		
		//배열2 : 자식클래스
		ColorPoint cp=new ColorPoint("red");
		System.out.println(cp.toString());
		
		ColorPoint[] point1=new ColorPoint[3];
		
		ColorPoint cp1=new ColorPoint(3,3,"red");
		ColorPoint cp2=new ColorPoint(1,2,"blue");
		ColorPoint cp3=new ColorPoint(5,6,"green");
		
		point1[0]=cp1;
		point1[1]=cp2;
		point1[2]=cp3;
		
		//System.out.println(point1[0].toString());
		
		for(int i=0; i<point1.length; i++) {
			point1[i].showInfo(); 
		}
		
		System.out.println("-----배열3-----");
		
		//배열3 : 섞어쓰기 및 메소드 오버라이드
		Point[] point2=new Point[5];
		
		Point po1=new Point(3,5);
		Point po2=new Point(6,6);
		Point cPo1=new ColorPoint(4,8,"purple");
		Point cPo2=new ColorPoint(9,4,"black");
		Point cPo3=new ColorPoint(2,1,"silver");
		
		point2[0]=po1;
		point2[1]=po2;
		point2[2]=cPo1;
		point2[3]=cPo2;
		point2[4]=cPo3;
		
		for(int i=0; i<point2.length; i++) {
			point2[i].showInfo(); //섞어쓰기 때문에 ColorPoint의 정보를 사용할 수 없지만 부모클래스에 자식클래스의 기능을 덮어쓴 상태.
		}
		
		System.out.println("-----배열3 자식클래스값 변경-----");
		
		//배열3 : 자료형 섞어쓴 변수값(배열값)의 자식클래스 정보 바꾸기 --> 자료형 Point를 ColorPoint로 바꾸면 자식클래스 메소드 이용 가능.
		((ColorPoint)cPo1).setColor("white");
		((ColorPoint)point2[3]).setColor("gold");
		
		for(int i=0; i<point2.length; i++) {
			point2[i].showInfo();
		}
		
		
		System.out.println("-----배열4-----");
		
		//배열4 : 업캐스팅
		Point[] point3=new Point[5];
		
		Point pp1=new Point(3,5);
		Point pp2=new Point(6,6);
		ColorPoint cpp1=new ColorPoint(4,8,"purple"); //배열 자료형은 Point지만 ColorPoint가 Point의 하위클래스이기 때문에 자동변환됨. 
		ColorPoint cpp2=new ColorPoint(9,4,"black");
		ColorPoint cpp3=new ColorPoint(2,1,"silver");
		
		point3[0]=pp1;
		point3[1]=pp2;
		point3[2]=cpp1;
		point3[3]=cpp2;
		point3[4]=cpp3;
		
		for(int i=0; i<point3.length; i++) {
			point3[i].showInfo(); //배열3과 같은 메소드 오버라이딩.
		}

	}

}
