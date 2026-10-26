package com.myjavaproject.stack;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("Minecraft");
		stack.push("DOOM");
		stack.push("Skyrim");
		stack.push("Call of Duty");
		stack.push("Valorant");
		
		stack.peek();
		String name = stack.pop();
		System.out.println(name);
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.search("Minecraft"));
	}
}
