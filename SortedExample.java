package com.techtalk.debu.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedExample {
	
	public static void main(String[] args) {
		
		
		List<Integer> sortedNumbers = Stream.of(5, 3, 1, 3, 6).sorted()
	            .collect(Collectors.toList());
		
		System.out.println(sortedNumbers);
	}

}
