package com.javaex.ex09;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv=new TV(7,20,false);
		
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();

		//채널, 볼륨 제한범위 초과 테스트
		tv.power(true);
		tv.channel(0);
		tv.volume(-3);
		tv.status();
		
		tv.channel(300);
		tv.volume(300);
		tv.status();
		
		tv.channel(true);
		tv.volume(true);
		tv.status();
		
		tv.channel(-1);
		tv.volume(-1);
		tv.status();
		
		tv.channel(false);
		tv.volume(false);
		tv.status();
		
		//System.out.println(tv.toString());
		
		

	}

}
