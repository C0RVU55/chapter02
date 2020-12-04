package com.javaex.ex20;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
		// 예외처리 : 클래스 만들기 힘들어서 MyFile 클래스를 사서 소스 안 까보고 매뉴얼 보고 쓴다고 가정.
		
		MyFile mf=new MyFile();
		
		/*
		//텍스트만 읽어주는 메소드 씀.(매뉴얼에 이런 내용이 있다침.)
		String str=mf.fileRead("경로"); 
		
		System.out.println(str);
		//이렇게 실행했는데 경로에 파일이 없을 경우
		*/
		
		//사용자 입장 상황1 - 정상적
		try {
			String str=mf.fileRead("c:/javaStudy/test.text");
			System.out.println(str);
		}catch(IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		//상황2 - 예외발생해서 예외처리된 메소드 사용
		/*
		MyFile mf2=new MyFile();
		String str2=mf2.fileRead2("c:/javaStudy/test.text");
		*/
		
		//상황3 - 사용자가 예외처리함
		MyFile mf2=new MyFile();
		try {
			String str2=mf2.fileRead2("c:/javaStudy/test.text");
			System.out.println(str2);
		}catch(IOException e) {
			System.out.println("file error"); //사용자마다 원하는 문구를 넣을 수 있을 것
		}
		
	}

}
