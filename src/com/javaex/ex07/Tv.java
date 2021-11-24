package com.javaex.ex07;

public class Tv {

	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public Tv() {
		// 디폴드 생성자
	}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		System.out.println("생성자(3)");
	}
	
	
	// 메소드 getter 
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}


	// 메소드 일반
	//--------power------------------
	
	public void power(boolean on) {
		this.power=on;
		if(on==true) {
			on=true;
		}else if(on==false){
			on=false;
		}
	}
	
	
	//--------channel-----------------
	
	public void channel(int channel) {
		if(channel<1) {
			this.channel=1;
		}else if(channel>255) {
			this.channel=255;
		}
	}
	
	public void channel(boolean up) {
		if(up==true) {
			this.channel=(channel+1);
		}else if(up==false) {
			this.channel=(channel-1);
		}
	}
	
		
	//--------volume-----------------
	public void volume(int volume) {
		if(volume<0) {
			this.volume=0;
		}else if(volume>100) {
			this.volume=100;
		}
	}
	
	public void volume(boolean up) {
		if(up==true) {
			this.volume = (volume+1);
		}else {
			this.volume = (volume-1);
		}
	}
	
	
	
	//--------status-----------------
	public void status() {
		System.out.println("▶전원: "+power+" | "+"＞채널: "+channel+" | "+"Δ볼륨: "+volume);
		System.out.println("---------------------------------");
	}
	
	
	//--------toString----------------

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	
}
