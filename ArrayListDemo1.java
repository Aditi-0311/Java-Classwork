package com.example;

import java.util.*;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Size of ArrayList:"+al.size());
		//Adding elements
		al.add("Java");
		al.add("JDBC");
		System.out.println("Elements of first arraylist:"+al);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("EJB");
		al2.add("Struts");
		//Adding the both array
		al2.addAll(al);
		System.out.println("Elements of second arraylist:"+al2);
		//Remove element
		al2.remove("EJB");
		System.out.println("Element of arraylist after deletion:"+al2);
		System.out.println("Size of arraylist:"+al2.size());
		
		//Retriving 2nd index element
		System.out.println("The element at 2nd index is:"+al2.get(2));
		
		

	}

}
