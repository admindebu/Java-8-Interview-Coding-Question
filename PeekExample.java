package com.techtalk.debu.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekExample {
	public static void main(String[] args) {

		List<String> strings = Stream.of("Badgers", "finals", "four","one").filter(s -> s.length() >= 4)
				.peek(s -> System.out.println(s)).map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(strings);
	}
}
