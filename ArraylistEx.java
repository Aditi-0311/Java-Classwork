package com.example;

import java.util.*;
public class ArraylistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Science");
		al1.add("Marathi");
		al1.add("Hindi");
		al1.add("Sanskrit");
		System.out.println("Fisrt Array List:"+al1);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("History");
		al2.add("Geography");
		al2.add("Civics");
		al2.add("Sociology");
		
		al1.addAll(al2);
		System.out.println("Second array list:"+al1);
		
		al2.addAll(al1);
		System.out.println("Third array list:"+al2);
	}

}
