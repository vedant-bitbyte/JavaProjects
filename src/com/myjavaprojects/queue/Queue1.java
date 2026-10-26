package com.myjavaprojects.queue;

import java.util.Collections;
// import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	/*public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Chad");
		queue.offer("Karen");
		queue.offer("Steve");
		
		//System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);
	}*/
	
	public static void main(String[] args) {
		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		queue.offer(3.56);
		queue.offer(1.4);
		queue.offer(7.32);
		queue.offer(2.6);
		
		System.out.println(queue);
	}
}
