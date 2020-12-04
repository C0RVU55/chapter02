package com.javaex.ex20;

import java.io.IOException;

public class MyFile {

	//예외처리
	
	//상황1
	public String fileRead(String path) throws IOException{ //IOException 임포트시켜야 사용가능. 발생할 수 있는 예외를 써둠.
		//대충 텍스트파일을 읽어서 String으로 리턴하는 로직
		//경로에 파일이 있는지 확인하는 로직이 있다고 가정
		
		//return "안녕하세요";
		throw new IOException(); //강제로 파일없는 오류내기
	}
	
	//상황2
	public String fileRead2(String path) throws IOException{ //throws 오류명 - 해당 오류를 main으로 보냄. 
		//위와 같은데 파일이 없을 경우를 위해 미리 처리해놓으려고 함.
		try {
			throw new IOException(); 
		}catch(IOException e) {
			System.out.println("파일 오류");
		}
		return "안녕하세요";
		
		//상황3
		/*
		오류나는 걸 아는데 예외처리할 때 어떤 문구를 출력할지(어떤 식으로 처리할지) 여기서 결정할 수 없는 경우
		위처럼 이 안에서 예외처리를 하는 게 아니라 main에 어떤 오류가 난다고(확실하게) 알려줄 수 있음.
		이게 throws IOException이고 아래처럼 써두면 됨.
		
		public String fileReads(String path) throws IOException{
			throw new IOException();
		}
		*/
	}
	
	
}
