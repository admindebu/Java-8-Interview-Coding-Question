package com.techtalk.debu.java8.stream;

import java.util.stream.Stream;

public class ToArrayExample {
	
	public static void main(String[] args) {
		
		Object[] objects = Stream.of(1, 2).toArray();
		
		System.out.println(objects.length);
	}

}
