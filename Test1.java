package com.example;

public class Test1 implements MyMethods{
	float l=2;
	float b=4;
	float area;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		t1.display();
		t1.accept();
		

	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is Rectangle");
		
	}

	public void accept() {
		// TODO Auto-generated method stub
		area=l*b;
		System.out.println("The Area of Rectangle:"+area);
	}

}
