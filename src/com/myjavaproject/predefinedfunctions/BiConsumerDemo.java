package com.myjavaproject.predefinedfunctions;

import java.util.LinkedHashMap;
import java.util.Map;

public class BiConsumerDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "ramesh");
		map.put(2, "yogesh");
		
		//forEach() in map uses, BiConsumer functional interface
		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});
	}
}
