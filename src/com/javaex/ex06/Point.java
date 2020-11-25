package com.javaex.ex06;

public class Point {
	//실제 개발할 때는 매우 복잡하기 때문에 틀을 한번에 다 안 만들고 나눠서 테스트하면서 만듦.
	//무조건 위에서 아래로 실행되는 게 아니라 필요한 거 갖다 쓰는 방식임. 물론 실행문은 위에서 아래로 실행됨.
	
	//필드
	private int x;
	private int y;
	
	//생성자 : 보통 기본생성자랑 모든 필드 있는 생성자 만듦.
	public Point() {
		super(); //아직 설명 안 해줌.
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//메소드 getter/setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 일반 : 사용자 화면에 나오는 점이라 복잡한 로직으로 이루어질 것.
	public void draw() {
		System.out.println("점[x= "+x+", y= "+y+"]을 그렸습니다.");
	}
	//메소드도 생성자 호출하는 것처럼 호출가능. 메소드 이름 쓰면 됨.
	public void draw(boolean opt) { //참이면 그리고 거짓이면 지움.
		if(opt==true) {
			System.out.println("점[x= "+x+", y= "+y+"]을 그렸습니다.");
		}else {
			System.out.println("점[x= "+getX()+", y= "+getY()+"]을 지웠습니다."); //<-- 옆에 있는 메소드 갖다 쓰면 됨.
		}
	}

	//generate toString : (메소드일반 만들기 전)테스트용으로 x, y값을 반환해줘서 값이 잘 대입돼서 메모리에 올라갔나 확인할 수 있음.
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
