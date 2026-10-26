package com.recursive.power;

public class Power_ {
	public static void main(String[] args) {
		System.out.println(power(2,  2));
	}
	
	private static int power(int base, int power) {
		if(power < 1) { // base case
			return 1;
		}
		return base * power(base, power - 1); // recursive
	}
}