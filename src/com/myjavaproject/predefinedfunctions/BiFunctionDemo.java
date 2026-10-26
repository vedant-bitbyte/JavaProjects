package com.myjavaproject.predefinedfunctions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> (t + u);
		Function<Integer, Integer> function = (num) -> (num * num);
		
		Integer result = biFunction.andThen(function).apply(10, 20);
		System.out.println(result);
	}
}
