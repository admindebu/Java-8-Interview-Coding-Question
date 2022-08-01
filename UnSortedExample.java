package com.techtalk.debu.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnSortedExample {
	
	public static void main(String[] args) {
		
		List<Integer> unSortedNumbers = Stream.of(1, 3, 4, 5, 6).sorted()
	            .collect(Collectors.toList());
		
		System.out.println(unSortedNumbers);
	}
	

}
