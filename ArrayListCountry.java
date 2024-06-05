package com.example;

import java.util.*;
//import java.util.ArrayList;
public class ArrayListCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.println("How many country do you want to add:");
		count=sc.nextInt();
		
		ArrayList<String> country =new ArrayList<String>();
		System.out.println("Enter Countrie:");
		sc.nextLine();
		for(int i=1;i<count;i++) {
			System.out.println("country"+i);
			String UserCountry=sc.nextLine();
			country.add(UserCountry);
		}
		
		System.out.println("Entered Countries Are:"+country);
	}

}
