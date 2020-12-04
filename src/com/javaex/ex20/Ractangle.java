package com.javaex.ex20;

public class Ractangle {

	int x;
	int y;
	
	public Ractangle(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void showInfo() {
		System.out.println("Ractangle [x=" + x + ", y=" + y + "]");
	}

	@Override
	public String toString() {
		return "Ractangle [x=" + x + ", y=" + y + "]";
	}
	

}
