package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		// static
		
		Goods camera=new Goods();
		camera.setName("니콘"); 
		camera.setPrice(400000);
		System.out.println(camera.getTotalCount());
		
		Goods computer=new Goods("LG그램", 1000000);
		System.out.println(computer.getTotalCount());
		//Goods computer=new Goods("LG그램", 1000); 생성자로는 값 수정 불가.
		
		System.out.println(Goods.totalCount);
		//그냥 totalCount하면 안 되고 자료형을 클래스명으로 써줘야 됨. 또 private면 안 되고 public이어야 됨.
		
		Goods cup=new Goods("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.getTotalCount());
		
		System.out.println(camera.toString());
		System.out.println(computer.toString());
		System.out.println(cup.toString());
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
	}

}
