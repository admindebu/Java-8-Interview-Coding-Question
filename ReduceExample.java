package com.techtalk.debu.java8.stream;

import java.util.stream.IntStream;

public class ReduceExample {
	
	public static void main(String[] args) {
		int sum = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b);
		
		System.out.println(sum);
	}
	

}
