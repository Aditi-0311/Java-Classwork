package com.example;

import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1=new LinkedList<String>();
		System.out.println("Initial size of LinkedList:"+l1.size());
		
		//Add element to linked list
		l1.add("Guhagar");
		l1.add("Anjanvel");
		l1.add("Aabloli");
		l1.add("Palshet");
		System.out.println("Elements of Linkedlist:"+l1);
		System.out.println("Szie of linkedlist:"+l1.size());
		
		//Remove element
		l1.remove(2);
		System.out.println("After Deletion:"+l1);
		System.out.println("Size after deletion:"+l1.size());
		
		//Retriving 1st and last element
		System.out.println("First Element of LinkedList:"+l1.getFirst());
		System.out.println("Last Element of LinkedList:"+l1.getLast());
		
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
