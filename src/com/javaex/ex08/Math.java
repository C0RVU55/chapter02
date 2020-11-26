package com.javaex.ex08;

public class Math {
	
	//메소드 오버로드 예제
	
	//필드 : 필드가 무조건 필요하진 않음.
	
	//생성자 : 메모리에 올리는 역할. 생성자가 여러개 있어도 하나만 쓸 수 있음. 한 번 쓰면 이미 틀이 메모리에 올라온 상태가 되기 때문.
	//public Math(){} 코드작성X 자동 생성. 근데 쓴다고 오류나진 않음.
	
	//메소드 getter/setter --> 필드값을 넣고 불러오는 용도인데 필드가 없으니까 생략 가능.
	
	//메소드 일반
	public int plus(int a, int b) { //메소드 이름 중복 가능.(조건: 자료형+개수+순서가 달라야 함.)
		int sum=a+b;
		return sum;
	}
	public double plus(double a, double b) {
		double sum=a+b;
		return sum;
	}
	/* 출력도 틀에서 하는 줄 알았는데 app에서 변수 대입해서 출력함...
	public void result() {
		System.out.println(sum);
	}
	*/

}
