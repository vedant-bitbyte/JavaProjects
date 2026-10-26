package com.myjavaprojects.dynamicarray;

public class DynamicArray__ {
	public static void main(String[] args) {
		DynamicArray dynamicArray = new DynamicArray(5);

		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("F");
		
		dynamicArray.insert(2, "T");
		dynamicArray.insert(4, "R");
		
		System.out.println(dynamicArray);
		System.out.println(dynamicArray.size);
		System.out.println(dynamicArray.capacity);
		System.out.println(dynamicArray.isEmpty());
		
		dynamicArray.delete("B");
		System.out.println(dynamicArray.search("T"));
		System.out.println(dynamicArray);
	}
}
