package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		// 추상클래스
		
		//데이터 잘 들어가나 테스트 --> 섞어써서 Shape 배열에 다 넣기
		//Shape s=new Shape("파랑","파랑"); 추상클래스로 만들어서 메모리에 올리기 불가능.
		//System.out.println(s.toString());
		
		Shape r=new Ractangle("노랑", "노랑",100,100);
		System.out.println(r.toString());
		r.draw();
		
		Shape c=new Circle("초록","초록",5);
		System.out.println(c.toString());
		c.draw();
		
		//Shape 배열 만들기
		Shape[] sArr=new Shape[2];
		sArr[0]=r;
		sArr[1]=c;
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i].draw();
		}
				
		//전부 면적 구하기
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i].area());
		}
	}

}
