package com.example;

public class AreaSquare implements Circle{
	int a = 5,area;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaSquare as = new AreaSquare();
		as.CSquare();
	}

	@Override
	public void CArea() {
		// TODO Auto-generated method stub
		System.out.println("This Is Area of Square");
	}

	@Override
	public void CSquare() {
		// TODO Auto-generated method stub
		area = 5*5;
		System.out.println("Area of Square is:"+area);
	}

}
