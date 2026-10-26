package com.myjavaproject.predefinedfunctions;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (s1, s2) -> (s1.equalsIgnoreCase(s2));
		
		System.out.println(biPredicate.test("ramesh", "Ramesh"));
		
		BiPredicate<Integer, Integer> biPredicate2 = (x, y) -> (x > y);
		BiPredicate<Integer, Integer> biPredicate3 = (x, y) -> (x == y);
		
		System.out.println(biPredicate2.and(biPredicate3).test(5, 6));
		System.out.println(biPredicate2.or(biPredicate3).test(5, 6));
		System.out.println(biPredicate2.negate().and(biPredicate3).or(biPredicate2).test(5, 6));
		
	}
}	
