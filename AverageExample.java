package com.techtalk.debu.java8.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageExample {
	
	public static void main(String[] args) {
		
		 OptionalDouble average = IntStream.of(1, 2, 3,6,12).average();
		 System.out.println(average);

	}


}
