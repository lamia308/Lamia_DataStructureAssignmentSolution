package com.lamia.question1.service;

import java.util.Collections;
import java.util.PriorityQueue;

public class QueueImplementation {
	
public static void main(String[] args) {
		
		PriorityQueue<Integer>queue= new PriorityQueue<>(Collections.reverseOrder());
		
		
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+" ");
		}

	}

}
