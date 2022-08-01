package com.techtalk.debu.java8.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyExample {
	public static void main(String[] args) {
		Optional<String> val = Stream.of("one", "two","45","three","four","789").findAny();

		System.out.println(val);
	}
}
