package com.myjavaprojects.linkedlist;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		
		linkedList.add(1, "E");
		System.out.println(linkedList);
		
		linkedList.remove("A");
		linkedList.addFirst("0");
		linkedList.addLast("G");
		
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println(linkedList);
	}
}
