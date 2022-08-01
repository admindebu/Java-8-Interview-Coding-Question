package com.techtalk.debu.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DistinctExample {
	
	public static void main(String[] args) {
		List<Integer> distinctIntegers = IntStream.of(5, 6, 6, 6, 3, 2, 2)
	            .distinct()
	            .boxed()
	            .collect(Collectors.toList());
		
		// IntStream boxed() returns a Stream consisting of the elements of this stream, each boxed to an Integer
		
		System.out.println(distinctIntegers);
	}

}
