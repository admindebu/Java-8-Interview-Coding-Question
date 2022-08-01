package com.techtalk.debu.java8.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class FirstMatchExample {
	
	public static void main(String[] args) {
		Optional<String> val = Stream.of("one", "two").findFirst();
		
		System.out.println(val);
	}

}
