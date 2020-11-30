package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {
		//클래스 상속관계
		/*
		Person p01=new Person("이다현", 25);
		System.out.println(p01.toString()); //p01(주소)에 접근하기 --> 주소명.메소드명
		
		Student p02=new Student("이대");
		System.out.println(p02.toString());
		*/
		
		/*
		Person p03=new Person("이다현", 25);
		System.out.println(p03.toString()); //Student에만 extends 쓴 상태 --> 변함없음.
		*/
		
		/*
		설계부터 상속관계이기 때문에 Student 부르면 메모리에 Person도 같이 올라오게 됨.
		
		Student p04=new Student("수원여자고등학교"); 
		System.out.println(p04.toString());
		
		p04.getAge() --> Student에 없는 메소드가 나오는 걸로 봐선 Person과 상속관계긴 한데 변수는 'schoolName'만 나오는 상태. 
					--> 자식클래스에 부모생성자 호출하면 됨. super(name, age);
		*/
		
		//상속관계에 있는 생성자 실행 및 완료 순서 확인용.
		Student p04=new Student("이다현",25,"수원여자고등학교"); //실행 순서 : 자식생성자 들어가서 부모생성자 실행 후 자식생성자 실행 --> Person(2) Student(3)
		System.out.println(p04.toString()); //이때 자식클래스의 필드값만 나옴. 데이터는 부모클래스, 자식클래스 각각에 저장되기 때문.
		p04.showInfo(); //받은 값 전부 출력하기.
		
		Student p05=new Student("수원여자고등학교"); 
		//실행 순서 : 그냥 자식생성자 실행 및 완료(근데 상속관계라 부모의 기본생성자가 자동으로 실행됨. --> Person() Student(1)
	}

}
