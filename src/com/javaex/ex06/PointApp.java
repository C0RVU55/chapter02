package com.javaex.ex06;

public class PointApp {
	//얘도 클래스가 필드, 생성자 있는데 다 생략된 상태.
	
	public static void main(String[] args) { //얘가 하나의 메소드라고 볼 수 있음.
		//toString 테스트
		//원래 테스트용은 아닌데 일반메소드 만들기 전에 값대입 잘 됐나 빠르게 테스트할 때 씀.
		
		Point p1=new Point();
		
		p1.setX(5);
		p1.setY(6);
		
		String str=p1.toString(); //변수말고 그대로 넣어서 출력도 되지만 하여튼 toString이 문자열을 만들어줌.
		System.out.println(p1.toString());
		p1.draw();
		
		Point p2=new Point(100,100);
		
		//쓸 때는 draw 하나갖고 쓰는 느낌인데 코드는 그렇지 않음.
		p2.draw();
		p2.draw(true);
		p2.draw(false);
	}

}
