package com.techtalk.debu.java8.stream;

import java.util.stream.Stream;

public class FilterExample {
	public static void main(String[] args) {
		
		
		long elementsLessThanThree = Stream.of(1, 2, 3, 4,10,9)
	            .filter(p -> p.intValue() < 7).count();

	    System.out.println("Less than 7 values are : " + elementsLessThanThree);
	}
	

}
