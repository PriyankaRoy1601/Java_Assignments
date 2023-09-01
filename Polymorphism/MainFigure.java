package com.nissan.app;

public class MainFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectanglef r=new Rectanglef();
		Trianglef t=new Trianglef();
		r.dim1=7.8;
		r.dim2=9.3;
		t.dim1=7;
		t.dim2=3.9;
		System.out.println("Area of rectangle="+r.area());
		System.out.println("Area of triangle="+t.area());

	}

}
