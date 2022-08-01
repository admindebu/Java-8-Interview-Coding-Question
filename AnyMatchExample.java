package com.techtalk.debu.java8.stream;

import java.util.stream.Stream;

public class AnyMatchExample {
	
	public static void main(String[] args) {
		boolean lengthOver5 = Stream.of("two", "three", "eighteen").anyMatch(
	            s -> s.length() > 5);
		
		System.out.println(lengthOver5);
		
		
		boolean lengthOver = Stream.of("two", "three", "Hey").anyMatch(
	            s -> s.length() > 5);
		
		System.out.println(lengthOver);
	}

}
