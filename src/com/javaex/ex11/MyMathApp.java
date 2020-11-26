package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
		// static
		
		//메모리에 올리지 않아도(new없이) 쓸 수 있어서 따로 생성자 부를 필요없음. 기본생성자 자동으로 씀.
		//변수를 따로 지정해서 주소값으로 들어가는 게 아니기 때문에 메소드 이름으로 접근함. --> MyMath.plus(3,4);
		
		//만약에 static에 있는데 new로 메모리에 불러오면 메모리공간 낭비하는 거.
		
		MyMath.plus(3,4);
		MyMath.plus(2.3, 3.7);
		MyMath.circle(3);
		
		//같은 변수 못 씀.
		int sum1=MyMath.plus(3,4);
		double sum2=MyMath.plus(2.3, 3.7);
		
		
		System.out.println(MyMath.plus(3,4));
		System.out.println(MyMath.plus(2.3, 3.7));
		System.out.println(MyMath.circle(3));
		
		// ***main과 다른 메소드의 변수라도 실행시키려면 main 안에서 써야 됨.***
		int sum3=minus(100,10); 
		
		
		/*이런 상태임. 전처럼 힙에다 틀 넣어놓고 변수로 틀 주소값 복사해서 쓰는 거 아니라 스태틱에 있는거 걍 갖다 씀.
		
		스태틱       MyMath.plus(int a, int b);  MyMath.plus(double a, double b);
		---------------------------------------------------------------------------
		
		스택         int sum1 □7                 double sum2 □6.0
		
		---------------------------------------------------------------------------
		
		힙           MyMath.plus(3,4);           MyMath.plus(3,4);
		
		*/

	}
	
	//메소드 : main에서 그냥 메소드가 안 써지는 건 main 자체가 static이라 여기서 쓰는 메소드도 static이어야 같이 쓸 수 있음. 
	public static int minus(int a, int b) {
		return a-b;
	}
	

}
