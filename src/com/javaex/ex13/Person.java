package com.javaex.ex13;

public class Person {
	//클래스 상속관계 : 각 객체에 필요한 필드를 추리는 게 추상화, 이 필드 안에 있는 공통점을 찾아 모으는 게 일반화.
	
	//필드
	protected String name;
	protected int age;
	
	//생성자 : 맨처음에 생성자 언급이 없거나 정하기 어려울 경우, 기본생성자와 모든필드생성자를 만듦.
	public Person() {
		System.out.println("Person()"); //실행확인용
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	
	//메소드 겟셋
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드 일반 : 특별한 언급 없으면 필드, 생성자, 메소드겟셋, toString 정도 만들어둠.
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
