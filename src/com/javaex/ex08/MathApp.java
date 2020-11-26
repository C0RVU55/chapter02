package com.javaex.ex08;

public class MathApp {

	public static void main(String[] args) {
		// 메소드 오버로드 예제
		
		
		Math myMath=new Math();
		
		int sum01=myMath.plus(3,4);
		System.out.println(sum01);
		
		double sum02=myMath.plus(2.3,4.5);
		System.out.println(sum02); // 둘 다 엄연히 다른 메소드지만 사용할 때는 같은 메소드처럼 보임.

	}

}
