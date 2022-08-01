package com.techtalk.debu.java8.stream;

import java.util.stream.IntStream;

public class NoneMatchExample {
	
	public static void main(String[] args) {
		boolean noElementEqualTo5 = IntStream.of(1, 2, 3)
	            .noneMatch(p -> p == 5);
		
		System.out.println(noElementEqualTo5);
		
		
		boolean noElementEqualTo = IntStream.of(1, 2, 3)
	            .noneMatch(p -> p == 3);
		
		System.out.println(noElementEqualTo);
	}

}
