package com.javaex.ex15;

public class Student extends Person { //이클립스 기능 : 클래스만들 때 superclass 지정 가능.
	//메소드 오버라이딩
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {}
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName=schoolName;
	}
	
	//메소드 겟셋
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드 일반
	public void showInfo() {
		//복잡한 로직으로 가정. 부모의 필드 접근제한자 바꿀 생각 없는 경우.
		System.out.println("이름: "+super.getName()+", 나이: "+super.getAge()+", 학교명: "+schoolName);
	}
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()="+getName()+", getAge()="+getAge()+"]";
	}
	
	

}
