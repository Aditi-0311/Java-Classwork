package com.example;

public class Test2 implements MyMethods{
	double r = 2, area;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		t2.display();
		t2.accept();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is Circle");
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		area=3.14*r*r;
		System.out.println("The area of Circle is:"+area);
	}

}
