package com.example;

import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating set using HashSet class
		Set<Integer> set1= new HashSet<>();
		
		//Add element to set1
		set1.add(2);
		set1.add(3);
		System.out.println("Set1:"+set1);
		
		//Creating another set
		Set<Integer> set2= new HashSet<>();
		
		//Add element to set2
		set2.add(5);
		set2.add(4);
		System.out.println("Set2:"+set2);
		
		//union of two set
		set2.addAll(set1);
		System.out.println("Union is:"+set2);
	}

}
