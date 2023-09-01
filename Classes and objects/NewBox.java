package com.nissan.app;

public class NewBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		Box b2=new Box();
		b1.width=2.2;
		b1.height=5.5;
		b1.depth=7;
		b2.width=8.7;
		b2.height=9.5;
		b2.depth=4;
		System.out.println("Volume of first box="+b1.Volume());
		System.out.println("Volume of second box="+b2.Volume());
		
		
	}

}
