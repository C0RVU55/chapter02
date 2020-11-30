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

	
	//메소드 겟셋 : 없어도 됨. --> 해설 : getter값만 작성함.
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
	
	//메소드 일반 --> power true일 때만 채널 및 볼륨 변경되도록 수정하기(완료)
	public void power(boolean on) {
		if(on==true) {
			power=true;
		}else {
			power=false;
		}
		//해설 this.power=on; 어차피 true 아님 false니까 굳이 if문으로 나눌 필요 없음.
	}
	public void channel(int channel) {
		//1-255
		if(power==true) {
			if(channel>255) {
				channel=255; //여기를 this.channel=255; 이렇게 해야 값이 반영됨.
			}else if(channel<1) {
				channel=1;
			}
			this.channel=channel;
		}
		/*해설 : 조건을 1줄 안에 넣음.
		if(channel<1||channel>255) {
			System.out.println("없는 채널입니다.");
		}else {
			this.channel=channel;
		}
		*/
		
	}
	public void channel(boolean up) {
		//채널이 1 또는 255인 상태에서 채널을 증감시켰을 때 제한범위를 넘지 않도록 조건문 추가.
		//볼륨도 마찬가지.
		if(power==true) {
			if(channel!=255 && up==true) { 
				channel=channel+1;
			}else if(channel!=1 && up==false) {
				channel=channel-1;
			}
		}
		/*
		해설 : 조건이 위 메소드에 다 있으니까 여기에 다시 쓸 필요 없고 위 메소드를 불러오면 됨. 볼륨도 마찬가지.
		if(up==true) {
			channel(this.channel+1);
		}else {
			channel(this.channel-1)
		}
		*/
	}
	
	public void volume(int volume) {
		//0-100
		if(power==true) {
			if(volume>100) {
				volume=100;
			}else if(volume<0) {
				volume=0;
			}
			this.volume=volume;
		}
	}
	public void volume(boolean up) {
		if(power==true) {
			if(volume!=100 && up==true) {
				volume=volume+1;
			}else if(volume!=0 && up==false) {
				volume=volume-1;
			}
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
