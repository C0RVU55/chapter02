package com.javaex.ex01;

public class GoodsCtorApp {

	public static void main(String[] args) {
		// Goods 생성자로 쓰기
		
		GoodsCtor camera=new GoodsCtor("니콘", 400000);
		camera.showInfo();
		
		GoodsCtor computer=new GoodsCtor("LG그램", 1000000);
		computer.showInfo();
		
		GoodsCtor cup=new GoodsCtor("머그컵", 2000);
		cup.showInfo();
	}

}
