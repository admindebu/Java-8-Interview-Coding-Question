package com.techtalk.debu.java8.stream;

import java.util.stream.Stream;

public class ForEachExample {
	
	public static void main(String[] args) {
		Stream.of("Hello", "World").forEach(p -> System.out.println(p));
	}

}
