package com.javaex.ex20;

public class Ex20 {

	public static void main(String[] args) {
		// 예외처리
		
		/*
		try {
			실행하려는 내용
		}catch(오류 예외클래스){
			오류났을 때 실행 내용
		}finally {
			정상 실행 내용(안 쓰는 경우가 많음)
		}
		*/
		
		//정상
		Ractangle r=new Ractangle(5,5);
		r.showInfo();
		
		//ArithmeticException : 0으로 나누려고 할 때 뜨는 오류
		
		//NullPointExcaeption : 주소값이 없는 경우
		try {
			Ractangle r01=null; //주소값이 없는 상황을 가정.
			r01.showInfo();
		}catch(NullPointerException e) { //어떤 오류를 잡을지 오류에 맞는 예외클래스를 넣어야 함. error의 e고 다른 알파벳도 가능.
			System.out.println("널포인트 발생 --> 처리로직");
		}
		
		//ArrayIndexOutOfBoundsException : 배열 범위외 오류
		try {
			int[] intArray=new int[] {3,6,9};
			System.out.println(intArray[3]);			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위외 --> 처리로직");
			System.out.println(e.getMessage()); //3이라고 나와서 무슨 오류인지 알기 힘든데 toString이면 어떤 오류인지 보여줌.
		}

	}

}
