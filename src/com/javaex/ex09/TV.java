package com.javaex.ex09;

public class TV {
	// 필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV() {}
	
	public TV(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}

	
	//메소드 겟셋 : 없어도 됨.
	/*
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	*/
	
	//메소드 일반 --> power true일 때만 채널 및 볼륨 변경되도록 수정하기
	public void power(boolean on) {
		if(on==true) {
			power=true;
		}else {
			power=false;
		}
	}
	public void channel(int channel) {
		//1-255
		if(channel>255) {
			channel=255;
		}else if(channel<1) {
			channel=1;
		}
		this.channel=channel;
	}
	public void channel(boolean up) {
		//채널이 1 또는 255인 상태에서 채널을 증감시켰을 때 제한범위를 넘지 않도록 조건문 추가.
		//볼륨도 마찬가지.
		if(channel!=255 && up==true) { 
			channel=channel+1;
		}else if(channel!=1 && up==false) {
			channel=channel-1;
		}
	}
	
	public void volume(int volume) {
		//0-100
		if(volume>100) {
			volume=100;
		}else if(volume<0) {
			volume=0;
		}
		this.volume=volume;
	}
	public void volume(boolean up) {
		if(volume!=100 && up==true) {
			volume=volume+1;
		}else if(volume!=0 && up==false) {
			volume=volume-1;
		}
	}
	
	
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	public void status() {
		System.out.println("채널: "+channel+"\n음량: "+volume+"\n전원: "+power+"\n-");
	}
}
