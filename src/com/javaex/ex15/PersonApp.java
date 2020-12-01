package com.javaex.ex15;

public class PersonApp {

	public static void main(String[] args) {
		// 메소드 오버라이딩
		
		//배열1 : Person 배열 
		Person[] pArr=new Person[5];
		
		Person p01=new Person("둘리",1203);
		//System.out.println(p01.toString());
		
		Person p02=new Person("도우너",200);
		Person p03=new Person("마이콜",300);
		
		pArr[0]=p01;
		pArr[1]=p02;
		pArr[2]=p03;
		/*
		for(int i=0; i<pArr.length; i++) {
			pArr[i].showInfo();
		}
		*/
		p01.showInfo();
		
		//배열2 : Student 배열 (상속관계O)
		/*
		Student[] sArr=new Student[3];
		Student s01=new Student("이다현",25,"이대");
		System.out.println(s01.toString());
		
		//부모와 자식 클래스에 있는 (특정 메소드)showInfo의 이름이 같으면 부모쪽 메소드를 자식이 덮어써서 못 씀. --> 메소드 오버라이딩
		//대체로 부모쪽 showInfo는 미완이기 때문에 부모 건 쓰기 싫다 하면 이름을 같게 만들어서 자식쪽 showInfo만 쓰이게 하는거.
		//만약에 showInfo를 1,2로 나눠놨으면 각각 부모, 자식쪽 showInfo를 쓸 수 있음.
		s01.showInfo();
		
		Student s02=new Student("배소연",18,"정문여상");
		Student s03=new Student("엘사",18,"야마스핀고");
		
		sArr[0]=s01;
		sArr[1]=s02;
		sArr[2]=s03;
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i].showInfo();
		}
		*/
		
		//배열3 : 섞어쓰기. Person배열에 Student extends Person 넣고 같이 관리하기 --> 자료형을 맞추고 자식클래스 정보유지를 위해 Student~를 Person인 척하게 만듦.
		//메모리에는 자식클래스로 올려서 변수 다 올리는데 자료형은 부모로 함. --> 실제로는 다 메모리에 있지만 Person만 보이는 상태가 돼서 자식쪽 정보 사용 불가능.
		Person s01=new Student("이다현", 25, "이대");
		
		//s01.getSchoolName(); 자식쪽 Student의 정보 사용 불가능한 상태.
		
		/*
		이 경우 showInfo는 자식쪽이 가려져 있기 때문에 부모쪽 showInfo가 쓰여야 되는데
		섞어써도 자식쪽이 부모쪽 showInfo를 덮어써서 자식쪽 showInfo만 쓸 수 있게 됨.-->메소드 오버라이딩
		toString도 마찬가지로 자식이 부모를 덮어써서 자식쪽 값으로 출력됨.
		*/
		s01.showInfo(); 
		System.out.println(s01.toString());
		
		Person s02=new Student("엘사",18,"야마스핀고");
		pArr[3]=s01;
		pArr[4]=s02;
		
		//Person배열에 Student extends Person값도 넣은 배열
		for(int i=0; i<pArr.length; i++) {
			pArr[i].showInfo();
		}
	}

}
