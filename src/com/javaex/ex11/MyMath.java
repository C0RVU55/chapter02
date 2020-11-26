package com.javaex.ex11;

public class MyMath {
	//static
	/*
	만약에 같은 코드를 계속 여러 명이 써야 되는데 다 new하면 사람 수만큼 메모리를 차지하게 될 테니까
	스태틱에 해당 기능을 넣으면 유저들이 필요할 때 스태틱에 있는 코드를 갖다 쓸 수 있도록 함.
	위 코드를 스태틱에 올렸으니까 Math.plus(int a, int b) 이렇게 표기. 이미 스태틱 자리를 차지해서 힙(메모리)에 자리 차지할 필요없음.
	*/
	
	//필드 - 생략 --> 원넓이 구하려고 추가
	public static double pi=3.14;
	
	//생성자 - 생략하고 기본생성자 사용
	
	//메소드 겟셋 - 필드 없으니까 생략
	
	//메소드 일반 - 공통으로 쓰일 거 같으니까 스태틱에 올림.
	public static int plus(int a, int b) {
		return a+b; //굳이 sum이라는 변수 잡을 필요없음.
		 
	}
	public static double plus(double a, double b) {
		return a+b;
	}
	
	/* 
	메소드를 static에 먼저 올리는데 이 시점에는 필드인 pi가 없어서 오류.
	pi도 static에 넣어서 전역변수로 만들면 됨. 3.14로 하면 혹시 모를 수정이 힘드니까.
	*/
	public static double circle(double r) {
		return r*r*pi;
	}	
	
}
