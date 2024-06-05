package com.example;

public class CircleArea implements Circle{
	double r = 5, area;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleArea ca = new CircleArea();
		ca.CSquare();
	}

	public void CArea() {
		// TODO Auto-generated method stub
		System.out.println("This Is Area Of Circle");
	}

	public void CSquare() {
		// TODO Auto-generated method stub
		area = 3.14*r*r;
		System.out.println("Area Of Circle:"+area);
	}

}
