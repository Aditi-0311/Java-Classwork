package com.example;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> users = new ArrayList<String>();
		users.add("Aditi");
		users.add("Soham");
		users.add("Tejas");
		users.add("Urfa");
		
		System.out.println("Users added in company are:"+users);
		
		//Traversing List 
		Iterator itr = users.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//To get Element from specific position
		String str = users.get(2);
		System.out.println("The fisrt User is:"+str);
		
		//Modify list at specific position
		users.set(3, "Ruhin");
		System.out.println("The Modified list is:"+users);
		
		//Remove element form list
		users.remove(3);
		System.out.println(users);
	}

}
