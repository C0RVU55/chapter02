package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		// 추상클래스 복습 + 인터페이스
		
		/*
		1.Shape(추상클래스)를 부모로 하는 자식클래스 Circle, Ractangle 만들기
		2.부모메소드에 abstract 붙이고 자식메소드로 오버라이딩시켜서 외형과 면적 출력하기
		3.자식클래스를 부모클래스형 배열에 넣고 (오버라이딩된)출력메소드 쓰기
		***인터페이스 추가***
		4.자식클래스 Triangle, Point 추가 --> Point는 면적 메소드가 필요없음.
	 	5.그리기 메소드를 인터페이스로 빼서 이걸 기준으로 다른 자식클래스를 묶음.
	 	6.(그리기 메소드)인터페이스와 (면적 메소드+색채우기 필드)부모클래스로 자식클래스를 묶게 됨.
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
		/*shape의 draw를 인터페이스로 옮겼기 때문에 shape[i].draw();는 불가능.
		for(int i=0; i<shape.length; i++) {
			shape[i].draw(); 
			System.out.println("면적:"+shape[i].area());
		}
		*/
		
		//인터페이스 : Point 추가
		System.out.println("----------------");
		
		Point p=new Point(3,3); 
		p.draw();
		
		/*
		인터페이스도 상속클래스 섞어쓰는 것처럼 씀. 마찬가지로 Drawable만 보이고 이름 겹치는 메소드를 자식클래스가 덮어쓴 상태.
		클래스가 아니라서 메소드 오버라이딩이라고 하진 않는데 어쨌든 인터페이스에 이름만 있는 메소드를 자식클래스가 구현시키는 거.
		부모클래스를 2개 이상 둘 수 없기 때문에 인터페이스를 이용함.
		*/
		Drawable pp=new Point(4,4); 
		pp.draw();
		//pp.getX(); --> 자식클래스가 안 보여서 못 씀.
		((Point)pp).getX(); //형변환(다운캐스팅)하면 가능.
		
		//점+도형 함께 관리하기 : 인터페이스 테스트 --> 배열에 넣어봄. (섞어쓰기했을 때 보이는 부분이 같아야 같은 배열에 넣을 수 있음.)
		Drawable[] d=new Drawable[4];
		
		Drawable dd1=new Circle("파랑","노랑",3);
		Drawable dd2=new Ractangle("파랑","초록",20,5);
		Drawable dd3=new Triangle("연두","주황",5,6);
		Drawable dd4=new Point(3,3);
		
		d[0]=dd1;
		d[1]=dd2;
		d[2]=dd3;
		d[3]=dd4; 
		
		for(int i=0; i<d.length; i++) {
			d[i].draw();
			//d[i].area(); Shape도 가려져서 못쓰는 상태
		}
		
		System.out.println("----------------");
		
		//순차적으로 area()로 부모가 Shape이면 면적 구하기 --> Point는 면적 없으니까 제외
		//연산자 instanceof(~를 부모로 갖고 있냐) 이용
		for(int i=0; i<d.length; i++) {
			if(d[i] instanceof Shape) {
				System.out.println(((Shape)d[i]).area()); //Draw를 기준으로 잡고 특정 메소드가 필요할 때마다 해당 메소드가 있는 클래스로 형변환시키는 식.
			}else {
				System.out.println("면적이 없습니다.");
			}
		}
		
	}

}
