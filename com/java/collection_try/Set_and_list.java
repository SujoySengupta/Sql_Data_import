package com.java.collection_try;
import java.util.*;

//The collection framework provides a set of classes and interfaces for storing and manipulating groups of data as a single unit. 
//It has various data structures like lists, sets, and maps, along with algorithms to manipulate them.

public class Set_and_list {
	public static void Set() {
		Set<String> set = new HashSet<String>();
		set.add("America");
		set.add("Poland");
		set.add("India");
		set.add("Sri Lanka");
		set.forEach(Desh->System.out.print(Desh + ", "));
	}
	public static void List() {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(50);
		list.add(40);
		list.add(30);
		list.forEach(num->System.out.println(num));
		
		}
	public static void main(String[] args) {
		Set();
		List();
	}
//Output:
//	Sri Lanka, America, Poland, India, 100
//	50
//	40
//	30

}
