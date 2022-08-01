package com.techtalk.debu.java8.stream;

import java.util.stream.Stream;

public class CountExample {
	
	public static void main(String[] args) {
		
		long count = Stream.of("one","234","hello","result","Imaginea").count();
		System.out.println(count);
	}

}
