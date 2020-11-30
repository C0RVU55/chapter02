package com.javaex.ex13;

public class Student extends Person { //자식클래스명 extends 부모클래스명 : 자식이 부모한테 가져오고 반대는 불가능.
	//클래스 상속관계
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		super();//생략가능한 생성자. 부모생성자 아무것도 안 쓰면 부모의 기본생성자가 실행되기 때문.
		this.schoolName=schoolName; 
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) { // !주의! 상속관계를 통해 쓰려는 필드 변수(부모+자식)를 파라미터에 다 써줘야 됨.
		/*
		상속클래스 실행 순서
		1. 본인 생성자 시작(완료X)
		2. 부모생성자 호출 : 부모의 어떤 생성자를 호출할지 선택 가능. 생성자를 여기에 안 쓰면 부모클래스의 기본생성자가 실행됨.
		3. 부모생성자 작업이 끝나면 자식(본인)생성자 작업을 완료함. 
		*/
		
		/*
		부모의 필드 가져오기(다른 방식) :
		부모필드가 private라서 변수를 직접 못 가져오고 아래처럼 'super.메소드' 형태(이때 메소드가 public이라 가능한 거)로 가져올 수도 있음. 
		super.setName(schoolName);
		super.setAge(age);
		*/
		
		/*
		부모생성자 호출 방법(부모필드를 쓰려면 부모클래스도 메모리에 올려야 돼서 생성자 호출하는 거)
		- 표기 없으면 기본생성자 호출
		- 선택하면 선택한 생성자 호출 : super(파라미터);
		*/
		super(name, age); //자식생성자가 super(파라미터)형태로 부모생성자 호출. 이때 부모클래스에도 같은 형태의 생성자가 있어야 함.
		this.schoolName=schoolName;
		System.out.println("Student(3)"); //예상 : 자식생성자 실행 -> 부모생성자 실행 및 완료(메모리에 올림) -> 자식생성자 완료 
	}
	
	//메소드 겟셋
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	//toString으로는 자식필드값만 나오니까 부모필드값까지 다 출력해보기
	public void showInfo() {
		/*자식에 getName이 없으면 super없이 메소드명만 써도 됨. 근데 자식이랑 부모랑 필드 겹치면 다시 생각해봐야 됨.
		System.out.println(super.getName()); 
		System.out.println(getAge());
		System.out.println(schoolName);
		*/
		System.out.println("이름:"+getName()+" 나이:"+getAge()+" 학교:"+schoolName);
		
		//접근제한자 --> Person의 필드를 protected로 바꾸면 부모 필드의 변수를 자식클래스에서 그대로 쓸 수 있음.
		System.out.println("이름:"+name+" 나이:"+age+" 학교:"+schoolName);
	}
	
}
