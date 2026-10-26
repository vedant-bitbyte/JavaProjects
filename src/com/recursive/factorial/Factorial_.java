package com.recursive.factorial;

import java.util.Scanner;

public class Factorial_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		System.out.println("Factorial: " + factorial(num));
		
		sc.close();
	}

	private static int factorial(int num) {
		if(num < 1) { // base case
			return 1;
		}
		return num * factorial(num - 1); // recursive
	}
}
